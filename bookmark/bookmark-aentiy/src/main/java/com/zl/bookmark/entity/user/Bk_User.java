package com.zl.bookmark.entity.user;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

/**
 * 用户实体
 * 
 * @author wt0911 zl 注：用户关联了俩张表：bk_user_level,bk_user_role
 */
@Entity
public class Bk_User implements Serializable{
	@Id
	@GenericGenerator(name = "sys_uuid", strategy = "uuid2")
	@GeneratedValue(generator = "sys_uuid")
	private String user_id;
	private String user_login_name;
	private String user_real_name;
	private Date user_birthDay;
	private String user_sex;
	private String user_password;
	// @Pattern(regexp="",message="请填写正确的邮箱格式！")
	@Email(message = "非法的email格式")
	private String user_email;
	private int user_mobilephone;
	private int user_isenabled;
	private int user_isdeleted;
	private int user_level;
	@Transient
	private String level_name;
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,
			CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinTable(name = "bk_user_role", joinColumns = {
			@JoinColumn(name = "user_role_user_id")}, inverseJoinColumns = {
					@JoinColumn(name = "user_role_role_id")})
	private Set<Bk_Role> bk_roles = new HashSet<Bk_Role>();
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_login_name() {
		return user_login_name;
	}
	public void setUser_login_name(String user_login_name) {
		this.user_login_name = user_login_name;
	}
	public String getUser_real_name() {
		return user_real_name;
	}
	public void setUser_real_name(String user_real_name) {
		this.user_real_name = user_real_name;
	}
	public Date getUser_birthDay() {
		return user_birthDay;
	}
	public void setUser_birthDay(Date user_birthDay) {
		this.user_birthDay = user_birthDay;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_mobilephone() {
		return user_mobilephone;
	}
	public void setUser_mobilephone(int user_mobilephone) {
		this.user_mobilephone = user_mobilephone;
	}
	public int getUser_isenabled() {
		return user_isenabled;
	}
	public void setUser_isenabled(int user_isenabled) {
		this.user_isenabled = user_isenabled;
	}
	public int getUser_isdeleted() {
		return user_isdeleted;
	}
	public void setUser_isdeleted(int user_isdeleted) {
		this.user_isdeleted = user_isdeleted;
	}
	public int getUser_level() {
		return user_level;
	}
	public void setUser_level(int user_level) {
		this.user_level = user_level;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public Set<Bk_Role> getBk_roles() {
		return bk_roles;
	}
	public void setBk_roles(Set<Bk_Role> bk_roles) {
		this.bk_roles = bk_roles;
	}

}
