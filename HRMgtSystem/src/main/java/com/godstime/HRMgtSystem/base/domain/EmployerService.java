package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.models.Employer;

import java.util.List;

public interface EmployerService extends BaseEntityService<Employer>{

    Result activate(String code);

    Result confirm(int employerId, int companyStaffId, int userConfirmationTypeId, boolean isConfirmed);

    DataResult<List<Employer>> getAllOnesThatWaitingForAccountConfirmation();

    DataResult<List<Employer>> getAllOnesThatWaitingForUpdateConfirmation();

    DataResult<List<Employer>> getAllByIsActivated(boolean isActivated);

    DataResult<List<Employer>> getAllByIsConfirmedAndUserConfirmationTypeId(boolean isConfirmed, int userConfirmationTypeId);

    DataResult<List<Employer>> getAllByIsConfirmedAndUserConfirmationTypeIdSortedByCompanyName(boolean isConfirmed, int userConfirmationTypeId);

    DataResult<Employer> getOneThatWaitingForUpdateConfirmationById(int id);

}
