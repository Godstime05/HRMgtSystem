package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

    JobTitle getByTitle(String title);

}
