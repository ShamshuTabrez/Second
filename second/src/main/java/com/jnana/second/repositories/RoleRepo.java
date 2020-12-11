package com.jnana.second.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnana.second.model.Roles;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Integer>{

	public List<Roles> findAll();
	
}
