package com.ruba.travel_guide.repository;

import com.ruba.travel_guide.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository  extends JpaRepository<City,Integer> {

}