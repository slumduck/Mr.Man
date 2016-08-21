package com.mime.hibernate.model.withannotation.Many2Many.bi;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	private UUID student_id;
	private String student_name;
	@ManyToMany(mappedBy = "students")
	private Set<Teacher> teachers = new HashSet<Teacher>();
	public UUID getStudent_id() {
		return student_id;
	}
	public void setStudent_id(UUID student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Set<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	

}
