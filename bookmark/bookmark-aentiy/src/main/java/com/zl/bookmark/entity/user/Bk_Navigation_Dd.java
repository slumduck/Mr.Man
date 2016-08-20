package com.zl.bookmark.entity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

/** 
 * 首页导航条各模块中子模块的标题
 * @author wt0911 zl  
 */
@Entity
public class Bk_Navigation_Dd {
	
	@Id
	@GenericGenerator(name="sys_uuid",strategy="uuid2")
	@GeneratedValue(generator="sys_uuid")
	private String navigation_dd_id;
	private String navigation_dd_a_href;
	private String navigation_dd_a_description;
	private String navigation_dd_target;
	private String navigation_dd_index;
	private String navigation_dd_parent_dl;
	@ManyToMany(mappedBy = "bk_navigation_dds", cascade = {CascadeType.DETACH,
			CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.MERGE}, fetch = FetchType.LAZY)
	private Set<Bk_Role> bk_roles = new HashSet<Bk_Role>();
	
	
	public String getNavigation_dd_id() {
		return navigation_dd_id;
	}
	public void setNavigation_dd_id(String navigation_dd_id) {
		this.navigation_dd_id = navigation_dd_id;
	}
	public String getNavigation_dd_a_href() {
		return navigation_dd_a_href;
	}
	public void setNavigation_dd_a_href(String navigation_dd_a_href) {
		this.navigation_dd_a_href = navigation_dd_a_href;
	}
	public String getNavigation_dd_a_description() {
		return navigation_dd_a_description;
	}
	public void setNavigation_dd_a_description(String navigation_dd_a_description) {
		this.navigation_dd_a_description = navigation_dd_a_description;
	}
	public String getNavigation_dd_target() {
		return navigation_dd_target;
	}
	public void setNavigation_dd_target(String navigation_dd_target) {
		this.navigation_dd_target = navigation_dd_target;
	}
	public String getNavigation_dd_index() {
		return navigation_dd_index;
	}
	public void setNavigation_dd_index(String navigation_dd_index) {
		this.navigation_dd_index = navigation_dd_index;
	}
	public String getNavigation_dd_parent_dl() {
		return navigation_dd_parent_dl;
	}
	public void setNavigation_dd_parent_dl(String navigation_dd_parent_dl) {
		this.navigation_dd_parent_dl = navigation_dd_parent_dl;
	}
	public Set<Bk_Role> getBk_roles() {
		return bk_roles;
	}
	public void setBk_roles(Set<Bk_Role> bk_roles) {
		this.bk_roles = bk_roles;
	}
}
