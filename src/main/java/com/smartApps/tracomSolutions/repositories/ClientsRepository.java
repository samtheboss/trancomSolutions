package com.smartApps.tracomSolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartApps.tracomSolutions.models.Clients;

import java.util.Optional;

@Repository
public interface ClientsRepository extends JpaRepository<Clients,Long> {

    Optional<Clients> findClientById(Long id);
}
