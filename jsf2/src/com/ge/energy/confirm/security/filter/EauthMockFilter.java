package com.ge.energy.confirm.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EauthMockFilter implements Filter {

	   private FilterConfig filterConfig;
		
	   @Override
	   public void destroy() {
	      this.filterConfig = null;
	   }

	   /**
	    * The <code>doFilter</code> method is called by the container each time 
	    * a request/response pair is passed through the chain due to a client 
	    * request for a resource at the end of the chain.
	    * This implementation will intercept the request and 'wrap' it with the
	    * custom request wrapper defined below such that the 'getHeader' 
	    * method can return the configured value when the 'SITEMINDER_ID'
	    * header value is requested.
	    */
	   @Override
	   public void doFilter(ServletRequest request, ServletResponse response,
	  		    FilterChain chain) throws IOException, ServletException {
	      // Hijack the request and make sure my version of getHeader gets called
	      MyRequestWrapper myRequest = new MyRequestWrapper((HttpServletRequest)request, filterConfig );
	      chain.doFilter(myRequest, response);
	   }

	   @Override
	   public void init(FilterConfig filterConfig) throws ServletException {
	      this.filterConfig = filterConfig;
	   }

	   public void setFilterConfig(FilterConfig filterConfig) {
	      this.filterConfig = filterConfig;
	   }

	   public FilterConfig getFilterConfig() {
	      return filterConfig;
	   }

	   /**
	    * This wrapper allows the ability to intercept the 'getHeader' method such
	    * that the a header for 'SITEMINDER_ID' can be effectively injected into
	    * the request so that the pre-authenticaton filter can get it.
	    *
	    */
	   class MyRequestWrapper extends HttpServletRequestWrapper {
	      FilterConfig myFilterConfig;
	      String smUser;
	     

	      public MyRequestWrapper(HttpServletRequest request, FilterConfig filterConfig) {
	         super(request);
	         myFilterConfig = filterConfig;
	          smUser = (filterConfig.getInitParameter("SM_USER")!=null) ? filterConfig.getInitParameter("SM_USER") : new String();
	      }
		
	      /**
	       * The main purpose of this method is to mock up the handling of the 'SITEMINDERID'
	       * header variable. When this value is requested, a value is returned based on the
	       * configured init param for the filter. If that value isn't set, then all requests
	       * are passed off to the super.
	       * 
	       * @param name The name of the header variable to get
	       * 
	       * @return a <code>String</code> containing the value of the requested header, or null if the request does not have a header of that name 
	       */
	      public String getHeader(String name) {
	         if ("SM_USER".equals(name)) {
	            return smUser;
	         } else {
	            return super.getHeader(name);
	         }
	      }
	   }
	}
