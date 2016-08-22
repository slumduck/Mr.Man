package com.zl.bookmark.dao.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/** 
 * @author wt0911 zl  
 */
@NoRepositoryBean //定义当前接口为顶级repository
public interface BaseRepository<T, ID extends Serializable> extends
PagingAndSortingRepository<T, Serializable>,
JpaSpecificationExecutor<T> {

}
