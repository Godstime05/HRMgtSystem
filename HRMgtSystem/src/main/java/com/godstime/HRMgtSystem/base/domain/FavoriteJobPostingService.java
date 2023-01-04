package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.FavoriteJobPosting;
import com.godstime.HRMgtSystem.entities.models.JobPosting;

import java.util.List;

public interface FavoriteJobPostingService extends BaseEntityService<FavoriteJobPosting>{

    DataResult<List<FavoriteJobPosting>> getAllByCandidateId(int candidateId);

    DataResult<List<JobPosting>> getAllActiveJobPostingsByCandidateIdSortedByDateOfAddToFavorites(int candidateId);

    DataResult<FavoriteJobPosting> getByCandidateIdAndJobPostingId(int candidateId, int jobPostingId);

}
