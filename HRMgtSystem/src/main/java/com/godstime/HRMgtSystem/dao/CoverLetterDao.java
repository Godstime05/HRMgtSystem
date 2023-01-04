package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.CoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {
    List<CoverLetter> getByCandidateId(int candidateId);
}
