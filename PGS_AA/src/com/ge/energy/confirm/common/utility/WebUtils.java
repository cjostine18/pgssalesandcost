package com.ge.energy.confirm.common.utility;


import javax.el.ELContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ge.energy.confirm.common.model.AaUser;


/**
 * Define the WebUtils Functions.
 * 
 * @version 1.0
 * @since JDK 1.5.0.11
 * @see java.lang.Object#toString()
 */
public abstract class WebUtils {
	// private static final Logger LOG = Logger.getLogger(WebUtils.class);

	/**
	 * @param name, obj
	 * @return Request Attribute.
	 */
	public static void setRequestAttribute(String name, Object obj) {
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap()
				.put(name, obj);
	}

	/**
	 * @param name
	 * @return Request Attribute.
	 */
	public static Object getRequestAttribute(String name) {
		return FacesContext.getCurrentInstance().getExternalContext()
				.getRequestMap().get(name);
	}

	/**
	 * @param name, obj
	 * @return Session Attribute.
	 */
	public static void setSessionAttribute(String name, Object obj) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.put(name, obj);
	}

	/**
	 * @param name
	 * @return Session Attribute.
	 */
	public static void removeSessionAttribute(String name) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.remove(name);
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public static Object getSessionAttribute(String name) {
		return FacesContext.getCurrentInstance().getExternalContext()
				.getSessionMap().get(name);
	}

	/**
	 * 
	 * @return boolean
	 */
	public static boolean getAsRunningFlag() {
		boolean flag;
		if (null == FacesContext.getCurrentInstance().getExternalContext()
				.getApplicationMap().get("AsRunningFlag")) {
			flag = false;
		} else {
			flag = (Boolean) FacesContext.getCurrentInstance()
					.getExternalContext().getApplicationMap().get(
							"AsRunningFlag");
		}
		return flag;
	}

	/**
	 * 
	 * @param boolean
	 */
	public static void setAsRunningFlag(boolean flag) {
		FacesContext.getCurrentInstance().getExternalContext()
				.getApplicationMap().remove("AsRunningFlag");
		FacesContext.getCurrentInstance().getExternalContext()
				.getApplicationMap().put("AsRunningFlag", flag);
	}

	/**
	 * 
	 * @return Object User
	 */
	public static AaUser getLoggedUser() {
		FacesContext fctx = FacesContext.getCurrentInstance();
		ELContext ectx = fctx.getELContext();
		return (AaUser) fctx.getApplication().getExpressionFactory()
				.createValueExpression(
						ectx,
						String
								.format("#{%s}",
										ConstantUtils.LOGGED_USER_EL_VAR),
										AaUser.class).getValue(ectx);
	}

	/**
	 * 
	 * @param request
	 * @return Object User
	 */
	public static AaUser getLoggedUser(HttpServletRequest request) {
		HttpSession sess = request.getSession(false);
		return sess != null ? (AaUser) sess
				.getAttribute(ConstantUtils.LOGGED_USER_SESSION_KEY) : null;
	}

	/**
	 * 
	 * @param request
	 * @param headers
	 * @return Header
	 */
	public static String getHeader(HttpServletRequest request,
			String... headers) {
		String value = null;
		for (String header : headers) {
			if ((value = request.getHeader(header)) != null) {
				break;
			}
		}
		return value;
	}

	/**
	 * 
	 * @param request
	 * @param params
	 * @return Parameter
	 */
	public static String getParameter(HttpServletRequest request,
			String... params) {
		String value = null;
		for (String param : params) {
			if ((value = request.getParameter(param)) != null) {
				break;
			}
		}
		return value;
	}
}
