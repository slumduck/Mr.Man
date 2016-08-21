package com.mime.hibernate.model.withannotation.one2one.bi.fk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Husband_Pk {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int IdCard;
	private String name;
	private String sex;
	@OneToOne
	@JoinColumn(name="wifeid")
	private Wife_Pk wife;

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
	public Wife_Pk getWife() {
		return wife;
	}
	public void setWife(Wife_Pk wife) {
		this.wife = wife;
	}
	

}
