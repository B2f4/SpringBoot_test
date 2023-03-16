package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.IUtenteService;

import jakarta.validation.Valid;

import com.example.demo.dto.LoginDTO;
import com.example.demo.dto.UtenteDTO;
@RestController
@RequestMapping("api/users")
public class UtenteController {
	
	@Autowired
	IUtenteService userService;
	
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO createUser (@Valid @RequestBody UtenteDTO utenteDTO) {
		return userService.createUser(utenteDTO);
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO deleteUser (@PathVariable("id") int id) {
		return userService.deleteUser(id);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<UtenteDTO> getAll () {
		return userService.getAll();
	}
	
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public UtenteDTO getById(@PathVariable("id") int id) {
		return userService.getById(id);
	}
	
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO updateUser (@PathVariable("id") int id, @Valid @RequestBody UtenteDTO utenteDTO) {
		return userService.updateUser(id, utenteDTO);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UtenteDTO login (@Valid @RequestBody LoginDTO loginDTO) {
		return userService.loginUser(loginDTO);
	}
	
	
	
}
