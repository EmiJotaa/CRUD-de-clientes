package com.devmj.desafiocrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devmj.desafiocrud.dto.ClientDTO;
import com.devmj.desafiocrud.entities.Client;
import com.devmj.desafiocrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}
}
