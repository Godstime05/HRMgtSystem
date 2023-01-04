package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.UpdatedEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpdatedEmployeeDao extends JpaRepository<UpdatedEmployer, Integer> {
    UpdatedEmployer getByEmployerId(int employerId);
}
