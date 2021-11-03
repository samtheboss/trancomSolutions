package com.smartApps.tracomSolutions.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.services.BranchesServices;

@RestController
@RequestMapping("/branchesApi")
public class BranchesController {

	@Autowired
	BranchesServices branchService;

	@GetMapping("/branches")
	public List<Branches> getAllBranches() {
		return branchService.getAllBranches();
	}
	@GetMapping("/branches/{id}")
	public Optional<Branches> getAllBranches(@PathVariable(name="id") Long id) {
		return branchService.getAllBranches(id);
	}

	@PostMapping("/branches")
	public ResponseEntity<String> addBranch(@RequestBody Branches branch) {
		return branchService.addNewBranch(branch);
	}

	@PutMapping("/branches")
	public ResponseEntity<String> updateBranch(@RequestBody Branches branch) {

		return branchService.updateBranch(branch);
	}

	@DeleteMapping("/branches/{id}")
	public ResponseEntity<String> deletebranch(@PathVariable(name="id") Long id) {

		return branchService.deleteBranch(id);
	}

}
