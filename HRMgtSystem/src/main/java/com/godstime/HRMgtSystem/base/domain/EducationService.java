package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.Education;

import java.util.List;

public interface EducationService extends BaseEntityService<Education>{

    DataResult<List<Education>> getAllByResumeId(int resumeId);

    DataResult<List<Education>> getAllByResumeIdSortedByGraduationDate(int resumeId);

}
