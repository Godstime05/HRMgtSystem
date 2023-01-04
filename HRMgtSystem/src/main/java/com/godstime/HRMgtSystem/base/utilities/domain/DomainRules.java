package com.godstime.HRMgtSystem.base.utilities.domain;

import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.base.utilities.results.SuccessResult;

public class DomainRules {
    public static Result run(final Result... logics){
        for (final Result logic : logics)
            if (!logic.isSuccess())
                return logic;
        return new SuccessResult();
    }
}
