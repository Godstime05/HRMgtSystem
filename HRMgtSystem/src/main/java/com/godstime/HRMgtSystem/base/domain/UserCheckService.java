package com.godstime.HRMgtSystem.base.domain;

import java.time.LocalDate;

public interface UserCheckService {
    boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
