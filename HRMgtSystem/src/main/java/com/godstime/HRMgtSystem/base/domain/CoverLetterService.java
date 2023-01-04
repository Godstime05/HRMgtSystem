package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.CoverLetter;

import java.util.List;

public interface CoverLetterService extends BaseEntityService<CoverLetter>{

    DataResult<List<CoverLetter>> getAllByCandidateId(int candidateId);
}
