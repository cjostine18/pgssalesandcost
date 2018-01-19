package com.ge.energy.confirm.web.form;

import static com.ge.energy.confirm.common.utility.ConstantUtils.LOGGED_USER_SESSION_KEY;
import static com.ge.energy.confirm.common.utility.WebUtils.getHeader;
import static com.ge.energy.confirm.common.utility.WebUtils.getParameter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.faces.FactoryFinder;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.context.FacesContextFactory;
import javax.faces.lifecycle.Lifecycle;
import javax.faces.lifecycle.LifecycleFactory;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.ge.energy.confirm.service.UserManager;
import com.ge.energy.confirm.web.form.AuthException;
import com.ge.energy.confirm.common.model.AaUser;
import com.ge.energy.confirm.common.utility.Utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Role based authentication and getting the header data
 *
 */
public class AaAuthFilter implements Filter {
	private static final String STAGE_PARAM_NAME = "stage";
	private static final String DEV_SSO_PARAM_NAME = "developer";
	private static final String WHITELIST_PARAM_NAME = "whitelist";
	private static final String USER_SERVICE_PARAM_NAME = "user-Manager";
	private static final String[] SM_SSO_HEADERS = { "uid", "sm_ssoid",
			"SM_USER", "SM_UNIVERSALID" };
	private static final String[] SM_FIRST_NAME_HEADERS = { "sm_first_name" };
	private static final String[] SM_LAST_NAME_HEADERS = { "sm_last_name" };
	private static final String[] SM_MAIL_HEADERS = { "sm_email" };
	private Log logger = LogFactory.getLog(this.getClass());
	private String developer;
	private Stage stage = Stage.PRODUCTION;
	private Set<String> whitelist = new HashSet<String>();
	private UserManager userService;
/**
 * 
 *
 */
	public static class CleanXSSRequest extends HttpServletRequestWrapper {
		public CleanXSSRequest(final HttpServletRequest res) {
			super(res);
		}

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		/*if (!req.isRequestedSessionIdValid()
				&& req.getRequestedSessionId() != null) {

			logger.info("logger");
			throw new SessionException("session expired");

		}*/

		if (!(isAuthenticated(request) || checkPassport(request))) {

			doAuthentication((HttpServletRequest) request, response);
		} else if (stage == Stage.LOCAL_DEV // Simulate re logon for DEV
											// convenience
				&& isAuthenticated(request)
				&& getParameter((HttpServletRequest) request, SM_SSO_HEADERS) != null) {

			doAuthentication((HttpServletRequest) request, response);

		}
		ServletRequest reqq = request;

		chain.doFilter(reqq, response);

	}

	private boolean checkPassport(ServletRequest req) {
		HttpServletRequest request = (HttpServletRequest) req;
		String uri = request.getRequestURI();
		if (request.getContextPath().length() > 0) {
			uri = uri.replace(request.getContextPath(), "");
		}
		return whitelist.contains(uri);
	}

	private void doAuthentication(HttpServletRequest request,
			ServletResponse response) {
		String sso = getHeader(request, SM_SSO_HEADERS);

		if ( sso == null && stage == Stage.LOCAL_DEV) {

			sso = getParameter(request, SM_SSO_HEADERS) != null ? getParameter(
					request, SM_SSO_HEADERS) : developer;
		}
		
		if (sso == null || "".equals(sso.trim())) {
			throw new AuthException("No SSO found from the http request.");
			//sso = "502026264" ;
		}

		AaUser user = new AaUser();
		// user.setSsoId(sso);

		// user.setSso(sso);

		String firstName = getHeader(request, SM_FIRST_NAME_HEADERS);
		String lastName = getHeader(request, SM_LAST_NAME_HEADERS);
		String mail = getHeader(request, SM_MAIL_HEADERS);
		if ( mail == null && stage == Stage.LOCAL_DEV) {

			mail = "sougata2.de@ge.com";
		}
		/*String tmp = null;
		if (stage == Stage.LOCAL_DEV) {
			tmp = getParameter(request, SM_FIRST_NAME_HEADERS);
			firstName = tmp != null ? tmp : firstName;
		}
		if (stage == Stage.LOCAL_DEV) {
			tmp = getParameter(request, SM_LAST_NAME_HEADERS);
			lastName = tmp != null ? tmp : lastName;
		}
		if (stage == Stage.LOCAL_DEV) {
			tmp = getParameter(request, SM_MAIL_HEADERS);
			mail = tmp != null ? tmp : mail;
		}*/
		String userRole = userService.checkUserRole(sso);
		if(userRole == null || "".equalsIgnoreCase(Utils.setString(userRole))){
			logger.error("Not a valid User");
			throw new AuthException(sso + " has no role assigned in Tool");
		}
			else{
				//For local 
				logger.info("Current Logedin User:"+sso+"  userRole=="+userRole);
			user.setRoleName(userRole);
			if( "Admin".equals(userRole)){
				user.modifyAAUser(sso, Utils.setString(firstName), Utils.setString(lastName), mail, 1, Utils.setString(userRole));
			}
			else{
				user.modifyAAUser(sso, Utils.setString(firstName), Utils.setString(lastName), mail, 2, Utils.setString(userRole));
			}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		if (facesContext == null) {
			getFacesContext(request, response).getExternalContext()
					.getSessionMap().put("user", user);
		} else {
			facesContext.getExternalContext().getSessionMap().put("user", user);
		}
		}

	}

	private boolean isAuthenticated(ServletRequest request)
			throws ServletException, IOException {

		HttpSession session = ((HttpServletRequest) request).getSession(false);
		// session.
		return session != null ? session.getAttribute(LOGGED_USER_SESSION_KEY) != null
				: false;
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		ApplicationContext appCtx = WebApplicationContextUtils
				.getRequiredWebApplicationContext(filterConfig
						.getServletContext());
		String beanId = filterConfig.getInitParameter(USER_SERVICE_PARAM_NAME);
		if (beanId == null || "".equals(beanId)) {
			throw new IllegalArgumentException("Init parameter '"
					+ USER_SERVICE_PARAM_NAME + "' is required.");
		}

		userService = (UserManager) appCtx.getBean(beanId);
		if (userService == null) {
			throw new IllegalArgumentException("bean id '" + beanId
					+ "' not found in spring context.");
		}
		if (filterConfig.getInitParameter(STAGE_PARAM_NAME) != null) {
			stage = Stage.valueOf(filterConfig
					.getInitParameter(STAGE_PARAM_NAME));
		}
		if (filterConfig.getInitParameter(DEV_SSO_PARAM_NAME) != null) {
			developer = filterConfig.getInitParameter(DEV_SSO_PARAM_NAME);
		}
		
		if (filterConfig.getInitParameter(WHITELIST_PARAM_NAME) != null) {
			String[] tokens = filterConfig.getInitParameter(
					WHITELIST_PARAM_NAME).split(",");
			for (String s : tokens) {
				whitelist.add(s);
			}
		}

	}

	public void destroy() {
		developer = null;
		stage = null;
		whitelist = null;
	}

	public static enum Stage {
		PRODUCTION, LOCAL_DEV,STAGGING
	}

	public UserManager getUserService() {
		return userService;
	}

	public void setUserService(UserManager userService) {
		this.userService = userService;
	}

	/**********************************************************************************/
	protected FacesContext getFacesContext(HttpServletRequest request,
			ServletResponse response) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		if (facesContext == null) {

			FacesContextFactory contextFactory = (FacesContextFactory) FactoryFinder
					.getFactory(FactoryFinder.FACES_CONTEXT_FACTORY);
			LifecycleFactory lifecycleFactory = (LifecycleFactory) FactoryFinder
					.getFactory(FactoryFinder.LIFECYCLE_FACTORY);
			Lifecycle lifecycle = lifecycleFactory
					.getLifecycle(LifecycleFactory.DEFAULT_LIFECYCLE);

			facesContext = contextFactory.getFacesContext(request.getSession()
					.getServletContext(), request, response, lifecycle);

			// Set using our inner class
			InnerFacesContext.setFacesContextAsCurrentInstance(facesContext);

			// set a new viewRoot, otherwise context.getViewRoot returns null
			UIViewRoot view = facesContext.getApplication().getViewHandler()
					.createView(facesContext, "");
			facesContext.setViewRoot(view);
		}
		return facesContext;
	}

	private abstract static class InnerFacesContext extends FacesContext {
		protected static void setFacesContextAsCurrentInstance(
				FacesContext facesContext) {
			FacesContext.setCurrentInstance(facesContext);
		}
	}

}
