package com.smartApps.tracomSolutions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartApps.tracomSolutions.models.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

}
