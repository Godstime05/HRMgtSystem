package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.userEntity.User;
import com.godstime.HRMgtSystem.base.utilities.results.Result;


public interface EmailService {
    Result sendEmail(User user);
}
