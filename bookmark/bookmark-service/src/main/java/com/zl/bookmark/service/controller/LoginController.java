package com.zl.bookmark.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @author wt0911 zl  
 */
//@Controller
//@RequestMapping()
public class LoginController {

	@RequestMapping(path="/")
	public String toLogin(){
		System.out.println("login..........................................");
		return "login";
	}
}
