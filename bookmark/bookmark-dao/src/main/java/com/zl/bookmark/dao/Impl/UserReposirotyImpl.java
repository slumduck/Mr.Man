package com.zl.bookmark.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.zl.bookmark.dao.UserReposirotyCustome;
import com.zl.bookmark.entity.user.Bk_User;

/** 
 * 用于扩展bk_user的操作，不被暴露的接口
 * @author wt0911 zl  
 */
public class UserReposirotyImpl implements UserReposirotyCustome{


	@PersistenceContext
	private EntityManager entityManager;
	
	public void findTest(){
		 entityManager.createQuery("From Bk_User");
	}
}
