package com.godstime.HRMgtSystem.base.utilities.aides.email;

import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.base.utilities.results.SuccessResult;
import org.springframework.stereotype.Service;

@Service
public class EmailManager implements EmailService{

    @Override
    public Result send(final String to, final String subject, final String messageBody) {
        return new SuccessResult("Email has been sent.");
    }
}
