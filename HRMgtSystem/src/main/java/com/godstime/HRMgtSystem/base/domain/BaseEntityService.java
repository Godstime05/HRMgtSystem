package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;

import java.util.List;

public interface BaseEntityService<T> {

    Result add(T entity);

    Result update(T entity);

    Result delete(int id);

    DataResult<List<T>> getAll();

    DataResult<T> getById(int id);

}
