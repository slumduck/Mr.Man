package com.zl.bookmark.entity.user;

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

import org.hibernate.annotations.GenericGenerator;

/**
 * 角色
 * 
 * @author wt0911 zl
 */

@Entity
public class Bk_Role {

	@Id
	@GenericGenerator(name = "sys_uuid", strategy = "uuid2")
	@GeneratedValue(generator = "sys_uuid")
	private String role_id;
	private String role_name;
	private String role_type;
	private String role_desc;
	private int role_isdelete;
	@ManyToMany(mappedBy = "bk_roles", cascade = {CascadeType.DETACH,
			CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.MERGE}, fetch = FetchType.LAZY)
	private Set<Bk_User> bk_users = new HashSet<Bk_User>();
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,
			CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinTable(name = "bk_role_navigation_dl", joinColumns = {
			@JoinColumn(name = "role_navigation_role_id")}, inverseJoinColumns = {
					@JoinColumn(name = "role_navigation_dl_id")})
	private Set<Bk_Navigation_Dl> bk_navigation_dls = new HashSet<Bk_Navigation_Dl>();
	@JoinTable(name = "bk_role_navigation_dd", joinColumns = {
			@JoinColumn(name = "role_navigation_role_id")}, inverseJoinColumns = {
					@JoinColumn(name = "role_natigation_dd_id")})
	private Set<Bk_Navigation_Dd> bk_navigation_dds = new HashSet<Bk_Navigation_Dd>();
	
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_type() {
		return role_type;
	}
	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	public int getRole_isdelete() {
		return role_isdelete;
	}
	public void setRole_isdelete(int role_isdelete) {
		this.role_isdelete = role_isdelete;
	}
	public Set<Bk_User> getBk_users() {
		return bk_users;
	}
	public void setBk_users(Set<Bk_User> bk_users) {
		this.bk_users = bk_users;
	}
	public Set<Bk_Navigation_Dl> getBk_navigation_dls() {
		return bk_navigation_dls;
	}
	public void setBk_navigation_dls(Set<Bk_Navigation_Dl> bk_navigation_dls) {
		this.bk_navigation_dls = bk_navigation_dls;
	}
	public Set<Bk_Navigation_Dd> getBk_navigation_dds() {
		return bk_navigation_dds;
	}
	public void setBk_navigation_dds(Set<Bk_Navigation_Dd> bk_navigation_dds) {
		this.bk_navigation_dds = bk_navigation_dds;
	}
	
}
