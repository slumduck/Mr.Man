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
	 * select by entity
	 * @param t
	 * @return
	 */
	T findOne(T t);
	/**
	 * select data all class equal T.class 
	 * @return
	 */
	List<T> findAll();
	/**
	 * delete by primary key
	 * @param id
	 * @return
	 */
	Serializable deleteOne(Serializable id);
	/**
	 * delete by entity
	 * @param t
	 * @return
	 */
	Serializable deleteOne(T t);
	/**
	 * delete by your idea
	 * @return
	 */
	Serializable delete();
	/**
	 * update data by entity
	 * @param t
	 * @return
	 */
	Serializable updateOne(T t);
	/**
	 * 
	 * @param t
	 * @return
	 */
	Serializable update(T t);
}
