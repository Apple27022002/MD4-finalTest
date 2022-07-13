package com.example.md4lasttest.service.impl;

import com.example.md4lasttest.model.City;
import com.example.md4lasttest.repository.CityRepository;
import com.example.md4lasttest.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CityService implements ICityService {
    @Autowired
    CityRepository cityRepository;
    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);

    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);

    }
}
