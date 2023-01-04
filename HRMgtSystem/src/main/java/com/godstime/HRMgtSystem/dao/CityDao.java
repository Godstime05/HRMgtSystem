package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {
}
