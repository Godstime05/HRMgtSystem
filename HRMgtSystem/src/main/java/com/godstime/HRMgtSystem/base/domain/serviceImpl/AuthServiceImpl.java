package com.godstime.HRMgtSystem.base.domain.serviceImpl;

import com.godstime.HRMgtSystem.base.domain.AuthService;
import com.godstime.HRMgtSystem.base.domain.CandidateService;
import com.godstime.HRMgtSystem.base.domain.CompanyStaffService;
import com.godstime.HRMgtSystem.base.domain.EmployerService;
import com.godstime.HRMgtSystem.base.userEntity.User;
import com.godstime.HRMgtSystem.base.utilities.results.ErrorResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.models.Candidate;
import com.godstime.HRMgtSystem.entities.models.CompanyStaff;
import com.godstime.HRMgtSystem.entities.models.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private CompanyStaffService companyStaffService;
    private CandidateService candidateService;
    private EmployerService employerService;

    private boolean checkIfPasswordsMatch(String passwod, String confirmPassword){
        boolean result = false;

        if (passwod.equals(confirmPassword)){
            result = true;
        }
        return  result;
    }

    private Result validateUser(User user, String confirmPassword){
        if (!checkIfPasswordsMatch(user.getPassword(), confirmPassword)){
            return new ErrorResult("Passwords doesn't match. Please check and try again");
        }
        return null;
    }
    @Autowired
    public AuthServiceImpl(CompanyStaffService companyStaffService, CandidateService candidateService, EmployerService employerService){
        this.companyStaffService = companyStaffService;
        this.candidateService = candidateService;
        this.employerService = employerService;
    }
    @Override
    public Result registerCompanyStaff(CompanyStaff companyStaff, String confirmPassword) {
        if (validateUser(companyStaff, confirmPassword) != null){
            return validateUser(companyStaff, confirmPassword);
        }
        return companyStaffService.add(companyStaff);
    }

    @Override
    public Result registerCandidate(Candidate candidate, String confirmPassword) {
        if (validateUser(candidate, confirmPassword) != null){
            return validateUser(candidate, confirmPassword);
        }
        return candidateService.add(candidate);
    }

    @Override
    public Result registerEmployer(Employer employer, String confirmPassword) {
        if (validateUser(employer, confirmPassword) != null){
            return validateUser(employer, confirmPassword);
        }
        return employerService.add(employer);
    }
}
