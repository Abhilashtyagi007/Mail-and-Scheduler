package com.email.repositories;

import com.email.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepo extends JpaRepository<Country,String> {

    List<Country> findByStatus(int status);
}
