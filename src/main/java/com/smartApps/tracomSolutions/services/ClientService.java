package com.smartApps.tracomSolutions.services;

import com.smartApps.tracomSolutions.exception.BranchNotFountException;
import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.models.Clients;
import com.smartApps.tracomSolutions.repositories.BranchesRepository;
import com.smartApps.tracomSolutions.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ResponseEntity<Boolean> addNewClient(final Clients clients) {
        Clients results = clientRepository.save(clients);
        if (results != null) {
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }
        return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public List<Clients> getAllClients() {
        return clientRepository.findAll();
    }

    public Clients findClientBy(Long id) {
        return clientRepository.findClientById(id).orElseThrow(
                () -> new BranchNotFountException("Client Not Found"));


    }
}
