package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.UserConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserConfirmationDao extends JpaRepository<UserConfirmation, Integer> {

    List<UserConfirmation> getByUser_Id(int userId);

    List<UserConfirmation> getByIsConfirmedAndUserConfirmationType_Id(boolean isConfirmed, int userConfirmationTypeId);

}
