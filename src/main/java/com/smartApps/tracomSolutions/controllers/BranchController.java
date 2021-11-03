package com.smartApps.tracomSolutions.controllers;

import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.services.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branchesApi")
public class BranchController {

	@Autowired
	BranchesService branchesService;

	@GetMapping("/branches/test")
	public String test() {
		return "hello branches!";
	}

	@GetMapping("/AllBranches")
	public List<Branches> getAllBranches() {
		return branchesService.getAllBranches();
	}
	@GetMapping("/branches/{id}")
	public ResponseEntity<Branches> getBranchById(@PathVariable("id") Long id) {
		Branches branches =branchesService.findBranchesById(id);
		return new ResponseEntity<>(branches, HttpStatus.OK);
	}

	@PostMapping("/branches")
	public ResponseEntity<Boolean> addNewBranch(@RequestBody Branches branches) {
		return branchesService.addNewBranch(branches);
	}
}
