package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.UpdatedEmployer;

public interface UpdateEmployerService extends BaseEntityService<UpdatedEmployer> {
    DataResult<UpdatedEmployer> getByEmployerId(int employerId);
}
