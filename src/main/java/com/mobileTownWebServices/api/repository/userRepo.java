package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileTownWebServices.api.model.user;

@Repository
public interface userRepo extends JpaRepository<user, Integer>{

}
