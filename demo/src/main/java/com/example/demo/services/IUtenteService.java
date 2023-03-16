package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.UtenteDTO;

public interface IUtenteService {

	public UtenteDTO createUser (UtenteDTO utenteDTO);
	public UtenteDTO deleteUser (int id);
	public List<UtenteDTO> getAll();
	public UtenteDTO getById (int id);
	public UtenteDTO updateUser (int id, UtenteDTO utenteDTO);
	
	
	
}
