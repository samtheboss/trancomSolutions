package com.smartApps.tracomSolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartApps.tracomSolutions.models.Devices;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Long> {

}
