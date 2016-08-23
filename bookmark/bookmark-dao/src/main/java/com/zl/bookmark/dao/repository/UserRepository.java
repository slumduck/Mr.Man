package com.zl.bookmark.dao.repository;

import org.springframework.data.jpa.repository.Query;

import com.zl.bookmark.entity.user.Bk_User;

/** 
 * @author wt0911 zl  
 */
public interface UserRepository extends BaseRepository<Bk_User, String> {
    
	@Query("select b from Bk_User b where b.user_login_name = ?1 ")
	Bk_User findByUser_login_name(String user_login_name);
}
