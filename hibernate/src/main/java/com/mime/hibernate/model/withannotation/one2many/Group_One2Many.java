package com.mime.hibernate.model.withannotation.one2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Group_One2Many {

	private int id;
	private String name;
	private Set<User_One2Many> users = new HashSet<User_One2Many>();
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
	
	@OneToMany
	@JoinColumn(name= "GroupId")
	public Set<User_One2Many> getUsers() {
		return users;
	}
	public void setUsers(Set<User_One2Many> users) {
		this.users = users;
	}
	
	
}
