package org.bookmark.dao.daoImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;

import org.bookmark.dao.BaseDao;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.Assert;

/** 
 * 公共数据访问接口实现
 * @author wt0911 zl  
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> entityClass;
	protected EntityManager entityManage;
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		Type type = entityClass.getGenericSuperclass();
		Assert.isInstanceOf(ParameterizedType.class, type, "子类和父类类型不一致");
		ParameterizedType parameterizedType = (ParameterizedType)type;
		Assert.isTrue(parameterizedType.getActualTypeArguments().length == 1);
		entityClass =  (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
	@Override
	public T findOne(Serializable id) {
		return null;
	}

	@Override
	public T findOne(T t) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public Serializable deleteOne(Serializable id) {
		return null;
	}

	@Override
	public Serializable deleteOne(T t) {
		return null;
	}

	@Override
	public Serializable delete() {
		return null;
	}

	@Override
	public Serializable updateOne(T t) {
		return null;
	}

	@Override
	public Serializable update(T t) {
		return null;
	}

}
