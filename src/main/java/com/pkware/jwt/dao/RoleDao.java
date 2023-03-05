package com.pkware.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkware.jwt.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
	
}
