package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.UserActivation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserActivationDao extends JpaRepository<UserActivation, Integer> {

    List<UserActivation> getByIsActivated(boolean isActivated);

    UserActivation getByCode(String code);

    UserActivation getByUser_Id(int userId);

}
