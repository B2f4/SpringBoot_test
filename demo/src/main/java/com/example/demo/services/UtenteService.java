package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UtenteDTO;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.repository.IUtenteRepository;

import jakarta.transaction.Transactional;
import com.example.demo.models.Utente;
@Service
public class UtenteService implements IUtenteService{

	@Autowired
	IUtenteRepository utenteRepository;
	
	@Autowired
	IRoleRepository roleRepository;
	
	@Override
	@Transactional
	public UtenteDTO createUser(UtenteDTO utenteDTO) {
		Utente utente = new Utente();
		utente.setUsername(utenteDTO.getUsername());
		utente.setPassword(utenteDTO.getPassword());
		utente.setRole(roleRepository.findByName(utenteDTO.getRole()).get(0));
		
		utenteRepository.save(utente);
		return utenteDTO;
	}

	@Override
	public UtenteDTO deleteUser(int id) {
		utenteRepository.deleteById(id);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UtenteDTO> getAll() {
		List<UtenteDTO> listDTO = new ArrayList<>();
		List<Utente>  listUser= utenteRepository.findAll();
		for (Utente newUtente : listUser) {
			UtenteDTO utenteDTO = new UtenteDTO();
			utenteDTO.setUsername(newUtente.getUsername());
			utenteDTO.setPassword(newUtente.getPassword());
			utenteDTO.setRole(newUtente.getRole().getName());
			listDTO.add(utenteDTO);
		}
		// TODO Auto-generated method stub
		return listDTO;
	}

	@Override
	public UtenteDTO getById(int id) {
		Utente utente = utenteRepository.getReferenceById(id);
		UtenteDTO utenteDTO = new UtenteDTO();
		utenteDTO.setUsername(utente.getUsername());
		utenteDTO.setPassword(utente.getPassword());
		utenteDTO.setRole(utente.getRole().getName());
		return utenteDTO;
	}

	@Override
	public UtenteDTO updateUser(int id, UtenteDTO utenteDTO) {
		Utente utente = utenteRepository.getReferenceById(id);
		utente.setUsername(utenteDTO.getUsername());
		utente.setPassword(utenteDTO.getPassword());
		utente.setRole(roleRepository.findByName(utenteDTO.getRole()).get(0));
		return utenteDTO;
	
	}
	

}
