package com.mime.hibernate.model.withannotation.Many2Many.bi;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Teacher {

	@Id
	private UUID teacher_id;
	private String teacher_name;
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "stu_tea",
			joinColumns={@JoinColumn(name="stu_id")},
	        inverseJoinColumns={@JoinColumn(name = "tea_id")}
	)
	private Set<Student> students = new HashSet<Student>();
	public UUID getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(UUID teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
