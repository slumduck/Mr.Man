package com.zl.bookmark.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * 登录、注册、找回密码
 * @author wt0911 zl  
 */
@Controller
@RequestMapping("/loginOrRegisterOrRetrieve")
public class LoginOrRegisterOrRetrieveController {

	@RequestMapping(params="cmd=login")
	public String login(){
		System.out.println("login..........................................");
		return "login";
	}
}
