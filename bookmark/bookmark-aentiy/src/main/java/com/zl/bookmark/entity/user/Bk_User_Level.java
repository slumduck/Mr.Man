package com.zl.bookmark.entity.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/** 
 * @author wt0911 zl  
 */
@Entity
public class Bk_User_Level {
  
	@Id
	@GenericGenerator(name="sysuuid",strategy="uuid2")
	@GeneratedValue(generator="sysuuid")
	private String level_id;
	private String level_name;
	private int level_rang_start;
	private int level_rang_end;
	
	public String getLevel_id() {
		return level_id;
	}
	public void setLevel_id(String level_id) {
		this.level_id = level_id;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public int getLevel_rang_start() {
		return level_rang_start;
	}
	public void setLevel_rang_start(int level_rang_start) {
		this.level_rang_start = level_rang_start;
	}
	public int getLevel_rang_end() {
		return level_rang_end;
	}
	public void setLevel_rang_end(int level_rang_end) {
		this.level_rang_end = level_rang_end;
	}
	
	
}
