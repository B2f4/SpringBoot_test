package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Utente;


@Repository
public interface IUtenteRepository extends JpaRepository<Utente, Integer>{
	
	public Utente findByUsernameAndPassword(String username, String password);
	
}
