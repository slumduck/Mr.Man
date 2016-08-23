package com.zl.bookmark.service.secrity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/** 
 * @author wt0911 zl  
 */
@Component
public class AuthenticationSuccess implements AuthenticationSuccessHandler {
    
	private static final String defaulSuccesstUrl = "index";
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		response.sendRedirect(defaulSuccesstUrl);
	}

}
