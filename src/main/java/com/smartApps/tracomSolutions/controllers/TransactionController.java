package com.smartApps.tracomSolutions.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smartApps.tracomSolutions.models.Transactions;
import com.smartApps.tracomSolutions.services.TransactionService;
//used to assign pos items to clients
@RestController
@RequestMapping("/transactionsApi")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	
	
	@GetMapping("/transactions")
	public List<Transactions> getAllTransactions() {
		return transactionService.getllTransactions();
	}
	@GetMapping("/transactions/{id}")
	public Optional<Transactions> getAllTransactions(@PathVariable(name="id") Long id) {
		return transactionService.getllTransactions(id);
	}
	
	@PostMapping("/transactions")
	public ResponseEntity<String> addTransaction(@RequestBody Transactions transaction) {
		return transactionService.addTransaction(transaction);
	}
	
	@PutMapping("/transactions")
	public ResponseEntity<String> updateTransaction(@RequestBody  Transactions transaction) {
		return transactionService.updateTransaction(transaction);
	}
	@DeleteMapping("/transactions/{id}")
	public  ResponseEntity<String> deleteTransaction(@PathVariable(name="id") Long id) {
		return transactionService.deleteTransaction(id);
	}
}
