package com.jnana.second;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jnana.second.model.Roles;
import com.jnana.second.model.User;
import com.jnana.second.repositories.RoleRepo;
import com.jnana.second.repositories.UserRepos;

@RestController
public class SecondController {

	@Autowired
	public UserRepos userrepo;

	@Autowired
	public RoleRepo roleRepo;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String welcome() {
		System.out.println("I am Here");
		return "hello";
	}

	@GetMapping("/roles")
	public List<Roles> getRoles() {
		return roleRepo.findAll();

	}

	@GetMapping("/getUser")
	public List<User> getUser() {
		return userrepo.findAll();

	}

}
