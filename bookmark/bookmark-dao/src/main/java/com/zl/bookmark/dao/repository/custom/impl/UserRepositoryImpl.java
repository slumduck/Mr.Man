package com.zl.bookmark.dao.repository.custom.impl;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zl.bookmark.dao.repository.custom.UserRepositoryCustome;

/** 
 * 用于扩展bk_user的操作，不被暴露的接口
 * @author wt0911 zl  
 */
public class UserRepositoryImpl implements UserRepositoryCustome{


	@PersistenceContext
	private EntityManager entityManager;
	@Resource
	private JdbcTemplate jdbcTemplate;

}
