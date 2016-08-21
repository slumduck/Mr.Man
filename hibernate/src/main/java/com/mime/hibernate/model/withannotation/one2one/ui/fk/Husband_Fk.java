package com.mime.hibernate.model.withannotation.one2one.ui.fk;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Husband_Fk {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int IdCard;
	private String name;
	private String sex;
	@OneToOne
	private Wife_Fk wife;

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
	public Wife_Fk getWife() {
		return wife;
	}
	public void setWife(Wife_Fk wife) {
		this.wife = wife;
	}
	

}
