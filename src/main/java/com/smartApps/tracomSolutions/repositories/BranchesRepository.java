package com.smartApps.tracomSolutions.repositories;

import com.smartApps.tracomSolutions.models.Branches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchesRepository extends JpaRepository<Branches,Long> {
   Optional <Branches>findBranchesById(Long id);
}
