package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Education;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationDao extends JpaRepository<Education, Integer> {
    List<Education> getByResumeId(int resumeId);
    List<Education> getByResumeId(int resumeId, Sort sort);
}
