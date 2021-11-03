package com.smartApps.tracomSolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartApps.tracomSolutions.models.Branches;

@Repository
public interface BranchesRepository extends JpaRepository<Branches, Long> {
	
}
