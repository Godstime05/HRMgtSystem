package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.WorkingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingTmeDao extends JpaRepository<WorkingTime, Integer> {
}
