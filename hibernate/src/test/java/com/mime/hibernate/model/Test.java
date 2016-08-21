package com.mime.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.c3p0.internal.C3P0ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import com.mime.hibernate.model.withxml.Student;

public class Test {
	public static void main(String[] args) {
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure( "hibernate.cfg.xml" )
				.build();

		Metadata metadata = new MetadataSources( standardRegistry ).buildMetadata();
				//.addAnnotatedClass( Student.class )
				//.addAnnotatedClassName( "org.hibernate.example.Customer" )
				//.addResource( "com/mime/hibernate/model/Student.hbm.xml" )
				//.addResource( "org/hibernate/example/Product.orm.xml" )
				//.getMetadataBuilder()
				//.applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
				//.build();
		C3P0ConnectionProvider provider = new C3P0ConnectionProvider();
		provider.injectServices( (ServiceRegistryImplementor) standardRegistry );
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
				//.applyBeanManager( getBeanManagerFromSomewhere() )
				.build();

		Student stu = new Student();
		stu.setName("小梅");
		stu.setSex("女");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(stu);
		session.getTransaction().commit();
		session.flush();
		session.close();
		sessionFactory.close();
	}
}
