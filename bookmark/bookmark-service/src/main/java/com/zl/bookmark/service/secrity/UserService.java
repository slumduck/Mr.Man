package com.zl.bookmark.service.secrity;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.zl.bookmark.dao.repository.UserRepository;
import com.zl.bookmark.entity.user.Bk_User;

/** 
 * @author wt0911 zl  
 */
public class UserService implements UserDetailsService {
    private static final transient Logger log = LoggerFactory.getLogger(UserService.class);
	@Resource
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		Bk_User bk_user = userRepository.findByUser_login_name(username);
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
