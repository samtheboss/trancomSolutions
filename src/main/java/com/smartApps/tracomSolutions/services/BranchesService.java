package com.smartApps.tracomSolutions.services;

import com.smartApps.tracomSolutions.exception.BranchNotFountException;
import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.repositories.BranchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchesService {

    @Autowired
    BranchesRepository branchesRepository;

    public ResponseEntity<Boolean> addNewBranch(final Branches branches) {
        Branches results = branchesRepository.save(branches);
        if (results != null) {
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        }
        return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public List<Branches> getAllBranches() {
        return branchesRepository.findAll();
    }

    public Branches findBranchesById(Long id) {
        return branchesRepository.findBranchesById(id).orElseThrow(
                () -> new BranchNotFountException("Branch Not Found"));


    }
}
