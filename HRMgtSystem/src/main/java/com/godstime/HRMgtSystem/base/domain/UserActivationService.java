package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.entities.models.UserActivation;

import java.util.List;

public interface UserActivationService extends BaseEntityService<UserActivation> {

    DataResult<UserActivation> getByCode(String code);
    DataResult<UserActivation> getByUserId(int userId);
    DataResult<List<UserActivation>> gettAllByIsActivated(boolean isActivated);
}
