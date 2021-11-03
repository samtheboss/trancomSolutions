package com.smartApps.tracomSolutions.controllers;

import ch.qos.logback.core.net.server.Client;
import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.models.Clients;
import com.smartApps.tracomSolutions.services.BranchesService;
import com.smartApps.tracomSolutions.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientApi")
public class ClientController {

	@Autowired
	ClientService clientService;

	@GetMapping("/clients/test")
	public String test() {
		return "hello clients!";
	}

	@GetMapping("/AllClients")
	public List<Clients> getAllBranches() {
		return clientService.getAllClients();
	}
	@GetMapping("/clients/{id}")
	public ResponseEntity<Clients> getBranchById(@PathVariable("id") Long id) {
		Clients clients =clientService.findClientBy(id);
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}

	@PostMapping("/clients")
	public ResponseEntity<Boolean>addNewClient (@RequestBody Clients clients) {
		return clientService.addNewClient(clients);
	}
}
