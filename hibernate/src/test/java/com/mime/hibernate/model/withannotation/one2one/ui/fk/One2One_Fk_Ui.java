package com.mime.hibernate.model.withannotation.one2one.ui.fk;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.mime.hibernate.model.BaseTest;


public class One2One_Fk_Ui extends BaseTest {

	@Test
	public void save() {
		Wife_Fk wife = new Wife_Fk();
		wife.setName("小小");
		wife.setSex("女");
		
		Husband_Fk husband = new Husband_Fk();
		husband.setName("大傻1");
		husband.setSex("男");
		husband.setWife(wife);

		Session session = BaseTest.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(wife);
        session.save(husband);
		session.getTransaction().commit();
		//session.flush();
		//session.close();
	}

	@Test
	public void select() {
	}
	

}
