package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
    List<Candidate> getByUserActivation_IsActivated(boolean isActivated);

    Candidate getByIdentityNumber (String identityNumber);
}
