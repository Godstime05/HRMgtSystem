package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Education;
import com.godstime.HRMgtSystem.entities.models.Employer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    List<Employer> getByUserActivation_IsActivated(boolean isActivated);
    List<Employer> getByUserConfirmations_IsConfirmedAndUSerConfirmations_UserConfirmationTypeId(boolean isConfirmed, int userConfirmationTypeId);

    List<Employer> getByUserConfirmations_IsConfirmedAndUserConfirmations_UserConfirmationType_Id(boolean isConfirmed, int userConfirmationTypeId, Sort sort);



}
