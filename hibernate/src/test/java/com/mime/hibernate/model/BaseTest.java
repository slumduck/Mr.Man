package com.mime.hibernate.model;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mime.hibernate.model.withannotation.Teacher;

import EnumType.ZhiCheng;

public class BaseTest {
	
	public static SessionFactory sessionFactory;

	/**
	 * 关于@BeforeClass、@AfterClass和@Before、@After两组注解的区别
	 * @BeforeClass、@AfterClass 注解的方法必须是公共的静态方法(public static void ...)，只在类实例化时，销毁时分别执行
	 * @Before、@After注解的方法必须公共的(public void ...),在该中每个方法执行之前和之后都会执行一次
	 */
	@BeforeClass
	//@Before
	public static void buildSessionFactory() {
		//第一步扫描hibernate.cfg.xml  注册服务
	    StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
	            .configure( "hibernate.cfg.xml" )
	            .build();

	    //第二步通过hibernate,cfg.xml中配置的实体映射关联到实体类
	    //连接数据库
	    Metadata metadata = new MetadataSources( standardRegistry ).buildMetadata();
	            //.addAnnotatedClass( Student.class )
	            //.addAnnotatedClassName( "org.hibernate.example.Customer" )
	            //.addResource( "com/mime/hibernate/model/Student.hbm.xml" )
	            //.addResource( "org/hibernate/example/Product.orm.xml" )
	            //.getMetadataBuilder()
	            //.applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
	            //.build();
         //第三步获取sessionFactory工厂
	     sessionFactory = metadata.getSessionFactoryBuilder()
	            //.applyBeanManager( getBeanManagerFromSomewhere() )
	            .build();
	}
	@AfterClass
	//@After
	public static void destorySessionFactory(){
		if(sessionFactory != null){
			sessionFactory.close();
		}
	}

}
