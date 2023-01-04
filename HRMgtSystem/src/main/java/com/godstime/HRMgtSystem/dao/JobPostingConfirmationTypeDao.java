package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.JobPostingConfirmationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingConfirmationTypeDao extends JpaRepository<JobPostingConfirmationType, Integer> {
}
