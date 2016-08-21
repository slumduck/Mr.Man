package com.mime.hibernate.model.withannotation.one2many_many2one;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.mime.hibernate.model.BaseTest;


public class Many2One_One2ManyTest extends BaseTest {

	@Test
	public void saveGroup() {
		Group group = new Group();		
		User user1 = new User();
		user1.setName("user1");
		User user2 = new User();
		user2.setName("user2");
		group.setName("group1");
        group.getUsers().add(user1);
        group.getUsers().add(user2);
        user1.setGroup(group);
        user2.setGroup(group);
		Session session = BaseTest.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(group);
		session.getTransaction().commit();
	}
	@Test
	public void saveUser() {

		Group group = new Group();	
		User user1 = new User();
		user1.setName("user5");
		User user2 = new User();
		user2.setName("user6");
		group.setName("group2");
        group.getUsers().add(user1);
        group.getUsers().add(user2);
        user1.setGroup(group);
        user2.setGroup(group);
		Session session = BaseTest.sessionFactory.getCurrentSession();
		session.beginTransaction();
		//session.save(group);
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
	}
	@Test
	public void select() {
	}
	

}
