package com.mime.hibernate.model.withannotation.one2one.ui.fk;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Wife_Fk {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int IdCard;
	private String name;
	private String sex;
	public int getIdCard() {
		return IdCard;
	}
	public void setIdCard(int idCard) {
		IdCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
