package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.JobPostingConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingConfirmationDao extends JpaRepository<JobPostingConfirmation, Integer> {
    JobPostingConfirmation getByJobPostingId(int jobPostingId);
}
