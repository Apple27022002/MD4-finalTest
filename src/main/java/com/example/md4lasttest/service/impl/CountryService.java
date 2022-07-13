package com.example.md4lasttest.service.impl;

import com.example.md4lasttest.model.Country;
import com.example.md4lasttest.repository.CountryRepository;
import com.example.md4lasttest.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CountryService implements ICountryService {
    @Autowired
    CountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);

    }

    @Override
    public void remove(Long id) {
        countryRepository.deleteById(id);

    }
}
