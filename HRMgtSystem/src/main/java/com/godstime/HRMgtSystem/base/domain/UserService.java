package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.userEntity.User;
import com.godstime.HRMgtSystem.base.utilities.results.DataResult;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    DataResult<User> getById(int id);
    DataResult<User> getByEmail(String email);
}
