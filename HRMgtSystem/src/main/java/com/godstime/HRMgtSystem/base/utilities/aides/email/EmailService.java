package com.godstime.HRMgtSystem.base.utilities.aides.email;

import com.godstime.HRMgtSystem.base.utilities.results.Result;

public interface EmailService {
    Result send(String to, String subject, String messageBody);
}
