package com.mime.hibernate.model.withannotation;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import EnumType.ZhiCheng;

@Entity

public class Teacher {

	@Id
	//@SequenceGenerator(name = "sequence_",sequenceName="sequnence_db")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sequence_")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String title;
	@Temporal(TemporalType.DATE)
	//@Access(AccessType.FIELD)
	private Date birthday;
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public ZhiCheng getZhicheng() {
		return zhicheng;
	}
	public void setZhicheng(ZhiCheng zhicheng) {
		this.zhicheng = zhicheng;
	}
	@Enumerated(EnumType.STRING)
	private ZhiCheng zhicheng;
	@Transient
	private String sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
