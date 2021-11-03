package com.smartApps.tracomSolutions.repositories;

import com.smartApps.tracomSolutions.models.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Long> {

    Optional<Devices> findDevicebySerialNumber(String serialnumber);
}
