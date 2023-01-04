package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.models.Candidate;

import java.util.List;

public interface CandidateService extends BaseEntityService<Candidate>{
    Result activate(String code);
    DataResult<List<Candidate>> getAllByIsActivated(boolean isActivated);
    DataResult<Candidate> getByIdentityNumber(String identityNumber);

}
