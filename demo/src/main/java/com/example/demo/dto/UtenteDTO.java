package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UtenteDTO {
	
	@NotNull
	@NotEmpty
	@Size(min = 3, max=16)
	String username;
	
	@NotNull
	@NotEmpty
	String password;
	
	@NotNull
	@NotEmpty
	String role;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
	
}
