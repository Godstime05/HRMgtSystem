package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.UserConfirmationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConfirmationTypeDao extends JpaRepository<UserConfirmationType, Integer> {
}
