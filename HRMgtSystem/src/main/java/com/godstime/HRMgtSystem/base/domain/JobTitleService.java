package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.JobTitle;

public interface JobTitleService extends BaseEntityService<JobTitle>{
    DataResult<JobTitle> getByTitle(String title);

}
