package com.jnana.second.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnana.second.model.User;

@Repository
public interface UserRepos extends JpaRepository<User, Integer> {

	public List<User> findAll();
	
	
}
