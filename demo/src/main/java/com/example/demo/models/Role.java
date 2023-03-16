package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	@OneToMany(mappedBy = "role", targetEntity = Utente.class)
	List<Utente> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Utente> getUsers() {
		return users;
	}
	public void setUsers(List<Utente> users) {
		this.users = users;
	}
	
	
	
	
}
