package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.UserConfirmation;

public interface UserConfirmationService extends BaseEntityService<UserConfirmation> {

    DataResult<UserConfirmation> getAllByUserId(int userId);

    DataResult<UserConfirmation> getAllByIsConfirmedAndUserConfirmationTypeId(boolean isConfirmed, int userConfirmationTypeId);
}
