package com.mime.hibernate.model.withannotation.many2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User_Many2One {

	private int id;
	private String name;
	private Group_Many2One group;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@ManyToOne
	@JoinColumn(name= "groupId")
	public Group_Many2One getGroup() {
		return group;
	}
	public void setGroup(Group_Many2One group) {
		this.group = group;
	}
	
}
