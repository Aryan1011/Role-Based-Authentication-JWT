package com.pkware.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkware.jwt.dao.RoleDao;
import com.pkware.jwt.entity.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDao roleDao;
	
	public Role CreateNewRole(Role role) {
		return roleDao.save(role);
	}
}
