package com.zl.bookmark.service.secrity;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.zl.bookmark.dao.repository.UserRepository;
import com.zl.bookmark.entity.user.Bk_User;

/** 
 * @author wt0911 zl  
 */
public class UserService implements UserDetailsService {
    private static final transient Logger log = LoggerFactory.getLogger(UserService.class);
	//@Resource
	//private UserRepository userRepository;
    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	@SuppressWarnings("unused")
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		//Bk_User bk_user = userRepository.findByUser_login_name(username);
		//UsernamePasswordAuthenticationFilter
		Bk_User bk_user = new Bk_User();
		bk_user.setUser_login_name(username);
		bk_user.setUser_password(bCryptPasswordEncoder.encode(username));
		UserSecrity userSecrity = null;
		if(bk_user != null){
			userSecrity = new UserSecrity();
			userSecrity.setBk_user(bk_user);
		}else{
			log.warn("用户名：{}不存在", username);
		}
		return userSecrity;
	}

}
