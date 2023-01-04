package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

    Resume getByCandidateId(int candidteId);

    Resume getByCoverLetterId(int coverLetterId);
}
