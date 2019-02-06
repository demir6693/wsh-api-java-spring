package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mobileTownWebServices.api.model.user;

@Repository
public interface userRepo extends JpaRepository<user, Integer>{

	@Query(value = "SELECT * FROM user WHERE user_name = ?1 AND password = ?2", nativeQuery = true)
	public user loginUser(String user_name, String password);
}
