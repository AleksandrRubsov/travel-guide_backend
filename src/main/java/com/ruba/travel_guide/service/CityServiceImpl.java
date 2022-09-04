package com.ruba.travel_guide.service;

import com.ruba.travel_guide.models.City;
import com.ruba.travel_guide.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;



    @Override
    public City saveCity(City city)
    {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getAllCity() {

        return cityRepository.findAll();
    }
}