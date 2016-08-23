package com.zl.bookmark.dao.repository.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.zl.bookmark.dao.repository.BaseRepository;

/** 
 * @author wt0911 zl  
 */
public class BaseRepositoryImpl<T,ID extends Serializable> extends SimpleJpaRepository<T, Serializable>implements BaseRepository<T, ID> {

	public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
	}
	/**
	 * 定义全局的 自定义方法或其他
	 */
}
