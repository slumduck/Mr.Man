package org.bookmark.dao;

import java.io.Serializable;
import java.util.List;

/** 
 * 访问数据库顶层接口
 * @author wt0911 zl  
 */
public interface BaseDao<T> {

	/**
	 * select by primary key
	 * @param id
	 * @return
	 */
	T findOne(Serializable id);
	/**
	 * select data all class equal T.class 
	 * @return
	 */
	List<T> findAll();
	/**
	 * delete by entity
	 * @param t
	 * @return
	 */
	void delete(T t);
	/**
	 * 
	 * @param t
	 * @return
	 */
	T update(T t);
}
