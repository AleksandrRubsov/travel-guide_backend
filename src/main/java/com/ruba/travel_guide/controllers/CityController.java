package com.ruba.travel_guide.controllers;

import com.ruba.travel_guide.models.City;
import com.ruba.travel_guide.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
@RequestMapping("/city")
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/add-city")
    @PreAuthorize("hasAuthority('city:write')")
    public String addCity(@RequestBody City city)
        {
        cityService.saveCity(city);
        return "Новый город добавлен";
        }

    @GetMapping("/getAll")
    @PreAuthorize("hasAuthority('developer:read')")
    public List<City> getAllCity()
    {
        return cityService.getAllCity();
    }

}