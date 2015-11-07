package com.kubrynski.blog.spring.service;

import com.kubrynski.blog.spring.data.model.Client;
import com.kubrynski.blog.spring.data.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jakub Kubrynski
 */
@Service
public class ClientService {

	private final ClientRepository clientRepository;

	@Autowired
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
}
