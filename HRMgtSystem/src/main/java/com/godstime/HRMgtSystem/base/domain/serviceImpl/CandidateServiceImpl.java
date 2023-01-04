package com.godstime.HRMgtSystem.base.domain.serviceImpl;

import com.godstime.HRMgtSystem.base.domain.*;
import com.godstime.HRMgtSystem.base.utilities.results.*;
import com.godstime.HRMgtSystem.dao.CandidateDao;
import com.godstime.HRMgtSystem.entities.models.Candidate;
import com.godstime.HRMgtSystem.entities.models.Resume;
import com.godstime.HRMgtSystem.entities.models.UserActivation;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class CandidateServiceImpl implements CandidateService {

    private CandidateDao candidateDao;
    private ResumeService resumeService;
    private UserService userService;
    private UserCheckService userCheckService;
    private UserActivationService userActivationService;
    private Result validateCandidate(Candidate candidate){
        if (!checkIfEmailExists(candidate.getEmail())){
            return  new ErrorResult("The email address you entered belongs to another account.");
        }
        if (!checkIfIdentityNumberExists(candidate.getIdentityNumber())){
            return new ErrorResult("The identity address you entered belongs to another account");
        }
        if (!userCheckService.checkIfRealPerson(candidate.getIdentityNumber(),candidate.getFirstName(),
                candidate.getLastName(), candidate.getDateOfBirth())){
            return new ErrorResult("Please enter your information correctly");
        }
        return null;
    }
    @Override
    public Result add(Candidate candidate) {

        if (validateCandidate(candidate) != null){
            return validateCandidate(candidate);
        }
        candidateDao.save(candidate);
        resumeService.add(new Resume(candidate));
        return userActivationService.add(new UserActivation(candidate));

    }

    @Override
    public Result update(Candidate candidate) {
        Candidate cand = getById(candidate.getId()).getData();

        candidate.setEmail(candidate.getEmail() == null || candidate.getEmail()==""
                ? cand.getEmail() : candidate.getEmail());
        candidate.setPassword(candidate.getPassword() == null || candidate.getPassword()== ""
                ? cand.getPassword() : candidate.getPassword());
        candidate.setFirstName(candidate.getFirstName() == null || candidate.getFirstName()==""
                ? cand.getFirstName() : candidate.getFirstName());
        candidate.setLastName(candidate.getLastName() == null || candidate.getLastName()==""
                ? cand.getLastName() : candidate.getLastName());
        candidate.setIdentityNumber(candidate.getIdentityNumber() == null || candidate.getIdentityNumber()==""
                ? cand.getIdentityNumber() : candidate.getIdentityNumber());
        candidate.setDateOfBirth(candidate.getDateOfBirth() == null
                ? cand.getDateOfBirth() : candidate.getDateOfBirth());

        if (validateCandidate(candidate) !=null){
            return validateCandidate(candidate);
        }

        candidateDao.save(candidate);
        return new SuccessResult("Job Seeker Updated");
    }

    @Override
    public Result delete(int id) {
        candidateDao.deleteById(id);
        return new SuccessResult("Job Seeker deleted");
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(candidateDao.findAll());
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(candidateDao.getById(id));
    }

    @Override
    public Result activate(String code) {
        UserActivation userActivation = userActivationService.getByCode(code).getData();
        if (userActivation == null){
            return new ErrorResult("You entered an invalid code");
        }
        Candidate candidate = getById(userActivation.getUser().getId()).getData();
        userActivation.setActivated(true);
        userActivation.setIsActivatedDate(LocalDateTime.now());

        candidateDao.save(candidate);
        userActivationService.update(userActivation);
        return new SuccessResult("Activation process has been completed");
    }

    @Override
    public DataResult<List<Candidate>> getAllByIsActivated(boolean isActivated) {
        return new SuccessDataResult<List<Candidate>>(candidateDao.getByUserActivation_IsActivated(isActivated));
    }

    @Override
    public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
        return new SuccessDataResult<Candidate>(candidateDao.getByIdentityNumber(identityNumber));
    }
    private boolean checkIfEmailExists(String email){
        boolean result = false;
        if (userService.getByEmail(email).getData() == null){
            result = true;
        }
        return result;
    }
    private boolean checkIfIdentityNumberExists(String identityNumber){
        boolean result = false;
        if (getByIdentityNumber(identityNumber).getData() == null){
            result = true;
        }
        return result;
    }
}
