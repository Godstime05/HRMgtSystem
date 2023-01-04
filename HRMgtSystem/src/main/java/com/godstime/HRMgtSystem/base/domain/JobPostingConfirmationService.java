package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.JobPostingConfirmation;

public interface JobPostingConfirmationService extends BaseEntityService<JobPostingConfirmation>{
    DataResult<JobPostingConfirmation> getByJobPostingId(int jobPostingId);
}
