package com.mime.hibernate.model.withannotation.one2one.bi.fk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Wife_Pk {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int IdCard;
	private String name;
	private String sex;
	@OneToOne(mappedBy="wife")
	private Husband_Pk husband;
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
	public Husband_Pk getHusband() {
		return husband;
	}
	public void setHusband(Husband_Pk husband) {
		this.husband = husband;
	}
	
	

}
