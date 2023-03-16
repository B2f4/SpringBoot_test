package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer>{

	public List<Role> findByName (String name);
	
}
