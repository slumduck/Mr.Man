package com.mime.hibernate.model.withannotation.Many2Many.bi;

import java.util.Date;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import com.mime.hibernate.model.BaseTest;


public class Many2Many_UITest extends BaseTest {

	@Test
	public void saveTeacher() {
		Teacher tea = new Teacher();
		tea.setTeacher_id(UUID.randomUUID());
		tea.setTeacher_name("张振栋");
		
		Student stu1 = new Student();
		stu1.setStudent_id(UUID.randomUUID());
		stu1.setStudent_name("张亮");
		
		Student stu2 = new Student();
		stu2.setStudent_id(UUID.randomUUID());
		stu2.setStudent_name("段海天");
		
		Student stu3 = new Student();
		stu3.setStudent_id(UUID.randomUUID());
		stu3.setStudent_name("巩文杰");
		
		
		tea.getStudents().add(stu1);
		tea.getStudents().add(stu2);
		tea.getStudents().add(stu3);
		
		stu1.getTeachers().add(tea);
		stu2.getTeachers().add(tea);
		stu3.getTeachers().add(tea);
		Session session = BaseTest.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(tea);
		session.getTransaction().commit();
	}
	@Test
	public void saveUser() {

		Session session = BaseTest.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.getTransaction().commit();
	}
	@Test
	public void select() {
	}
	

}
