package com.smartApps.tracomSolutions.repositories;

import com.smartApps.tracomSolutions.models.Clients;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Long> {
    Optional<Clients> findClientById(Long id);
}
