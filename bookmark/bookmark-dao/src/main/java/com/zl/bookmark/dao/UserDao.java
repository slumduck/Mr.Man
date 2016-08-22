package com.zl.bookmark.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zl.bookmark.repository.UserReposiroty;

/** 
 * @author wt0911 zl  
 */
@Repository
public class UserDao {
   @Resource
   private UserReposiroty userReposiroty;
   @PersistenceContext
   private EntityManager entityManage;
   @Resource
   private JdbcTemplate jdbcTemplate;
   
   public void test(){
	   userReposiroty.findTest();
   };
}
