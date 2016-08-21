package com.mime.hibernate.model.withannotation.IdGeneratorStrategy;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employe {


	@Id
	private Employe_PK pk;
	private String sex;
	private Date birthday;
	public Employe_PK getPk() {
		return pk;
	}
	public void setPk(Employe_PK pk) {
		this.pk = pk;
	}
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

}
