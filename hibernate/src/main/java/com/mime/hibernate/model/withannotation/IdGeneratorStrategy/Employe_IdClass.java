package com.mime.hibernate.model.withannotation.IdGeneratorStrategy;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
@Entity
@IdClass(Employe_IdClass_PK.class)
public class Employe_IdClass {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	@Id
	private String name;
	private String sex;
	private Date birthday;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
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

}
