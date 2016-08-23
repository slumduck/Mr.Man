package com.zl.bookmark.service.secrity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/** 
 * @author wt0911 zl  
 */
@Component
public class AuthenticationFailure implements AuthenticationFailureHandler {

	private static final String defaultFailureUrl = "logout";
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		/**
		 * 认证失败调到退出页面
		 */
		response.sendRedirect(defaultFailureUrl);
	}

}
