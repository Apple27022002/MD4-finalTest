package com.example.md4lasttest.repository;

import com.example.md4lasttest.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
