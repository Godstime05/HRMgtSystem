package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.Experience;

import java.util.List;

public interface ExperienceService extends BaseEntityService<Experience>{

    DataResult<List<Experience>> getAllByResumeId(int resumeId);

    DataResult<List<Experience>> getAllByResumeIdSortedByTerminationDate(int resumeId);

}
