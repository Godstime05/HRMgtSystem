package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.FavoriteJobPosting;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteJobPostingDao extends JpaRepository<FavoriteJobPosting, Integer> {

    List<FavoriteJobPosting> getByCandidate_Id(int candidateId);

    List<FavoriteJobPosting> getByCandidate_Id(int candidateId, Sort sort);

    FavoriteJobPosting getByCandidate_IdAndJobPosting_Id(int candidateId, int jobPostingId);

}
