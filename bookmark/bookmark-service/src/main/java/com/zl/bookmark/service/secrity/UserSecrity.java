package com.zl.bookmark.service.secrity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.zl.bookmark.entity.user.Bk_User;

/** 
 * @author wt0911 zl  
 */
public class UserSecrity implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1357712748493750751L;

	private Bk_User bk_user;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return bk_user.getBk_roles();
	}

	@Override
	public String getPassword() {
		return bk_user.getUser_password();
	}

	@Override
	public String getUsername() {
		return bk_user.getUser_login_name();
	}

	@Override
	public boolean isAccountNonExpired() {
		return bk_user.getUser_isenabled()==0 ? true :false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return bk_user.getUser_isenabled()==0 ? true :false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return bk_user.getUser_isenabled()==0 ? true :false;
	}

	@Override
	public boolean isEnabled() {
		return bk_user.getUser_isenabled()==0 ? true :false;
	}

	public Bk_User getBk_user() {
		return bk_user;
	}

	public void setBk_user(Bk_User bk_user) {
		this.bk_user = bk_user;
	}

}
