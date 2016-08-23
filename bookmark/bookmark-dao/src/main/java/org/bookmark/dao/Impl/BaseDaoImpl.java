package org.bookmark.dao.Impl;

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
		return entityManage.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String qlString = "from " + entityClass.getSimpleName();
		List<T> list = (List<T>) entityManage.createQuery(qlString);
		return list;
	}

	@Override
	public void delete(T t) {
		 entityManage.remove(t);
	}

	@Override
	public T update(T t) {
		return entityManage.merge(t);
	}

}
