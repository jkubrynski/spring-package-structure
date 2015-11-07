package com.kubrynski.blog.spring.rest;

import com.kubrynski.blog.spring.data.model.Client;
import com.kubrynski.blog.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jakub Kubrynski
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

	private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Client> listClients() {
		return clientService.getAllClients();
	}

}
