package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.models.Candidate;
import com.godstime.HRMgtSystem.entities.models.CompanyStaff;
import com.godstime.HRMgtSystem.entities.models.Employer;

public interface AuthService {
    Result registerCompanyStaff(CompanyStaff companyStaff, String confirmPassword);
    Result registerCandidate(Candidate candidate, String confirmPassword);
    Result registerEmployer(Employer employer, String confirmPassword);
}
