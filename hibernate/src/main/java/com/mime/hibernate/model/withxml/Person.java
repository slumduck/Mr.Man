package com.mime.hibernate.model.withxml;

import java.util.Date;

public class Person {

	private PersonPK personPk;
	private String sex;
	private Date birthday;
	private float high;
	public PersonPK getPersonPk() {
		return personPk;
	}
	public void setPersonPk(PersonPK personPk) {
		this.personPk = personPk;
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
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	
	
}
