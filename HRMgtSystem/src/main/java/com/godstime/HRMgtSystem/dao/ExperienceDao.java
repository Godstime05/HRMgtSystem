package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Education;
import com.godstime.HRMgtSystem.entities.models.Experience;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
    List<Experience> getByResumeId(int resumeId);
    List<Experience> getByResumeId(int resumeId, Sort sort);
}
