package com.zl.bookmark.repository;

import java.io.Serializable;

import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import com.zl.bookmark.dao.UserReposirotyCustome;
import com.zl.bookmark.entity.user.Bk_User;

/** 
 * @author wt0911 zl  
 */
public interface UserReposiroty extends BaseRepository<Bk_User, Serializable>,UserReposirotyCustome {

	Bk_User findByUser_login_name(String user_Id);
}
