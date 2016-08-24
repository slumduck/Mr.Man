package com.zl.bookmark.entity.user;

import java.io.Serializable;
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
 * 首页导航条各模块标题
 * @author wt0911 zl  
 */
@Entity
public class Bk_Navigation_Dl implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4256964190630251017L;
	@Id
	@GenericGenerator(name="sys_uuid",strategy="uuid2")
	@GeneratedValue(generator="sys_uuid")
    private String navigation_dl_id;
	private String navigation_dl_class;
	private String navigation_dt_backgroud_image;
	private String navigation_dt_description;
	private String navigation_dl_index;
	@ManyToMany(mappedBy = "bk_navigation_dls", cascade = {CascadeType.DETACH,
			CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.MERGE}, fetch = FetchType.LAZY)
	private Set<Bk_Role> bk_roles = new HashSet<Bk_Role>();
	
	public String getNavigation_dl_id() {
		return navigation_dl_id;
	}
	public void setNavigation_dl_id(String navigation_dl_id) {
		this.navigation_dl_id = navigation_dl_id;
	}
	public String getNavigation_dl_class() {
		return navigation_dl_class;
	}
	public void setNavigation_dl_class(String navigation_dl_class) {
		this.navigation_dl_class = navigation_dl_class;
	}
	public String getNavigation_dt_backgroud_image() {
		return navigation_dt_backgroud_image;
	}
	public void setNavigation_dt_backgroud_image(
			String navigation_dt_backgroud_image) {
		this.navigation_dt_backgroud_image = navigation_dt_backgroud_image;
	}
	public String getNavigation_dt_description() {
		return navigation_dt_description;
	}
	public void setNavigation_dt_description(String navigation_dt_description) {
		this.navigation_dt_description = navigation_dt_description;
	}
	public String getNavigation_dl_index() {
		return navigation_dl_index;
	}
	public void setNavigation_dl_index(String navigation_dl_index) {
		this.navigation_dl_index = navigation_dl_index;
	}
	public Set<Bk_Role> getBk_roles() {
		return bk_roles;
	}
	public void setBk_roles(Set<Bk_Role> bk_roles) {
		this.bk_roles = bk_roles;
	}
}
