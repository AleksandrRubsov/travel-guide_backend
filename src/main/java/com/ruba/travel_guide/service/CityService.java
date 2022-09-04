package com.ruba.travel_guide.service;

import com.ruba.travel_guide.models.City;

import java.util.List;


public interface CityService {
    public City saveCity(City city);
    public List<City> getAllCity();

}
