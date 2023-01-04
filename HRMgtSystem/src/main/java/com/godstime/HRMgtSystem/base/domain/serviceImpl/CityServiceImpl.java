package com.godstime.HRMgtSystem.base.domain.serviceImpl;

import com.godstime.HRMgtSystem.base.domain.CityService;
import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.base.utilities.results.SuccessDataResult;
import com.godstime.HRMgtSystem.base.utilities.results.SuccessResult;
import com.godstime.HRMgtSystem.dao.CityDao;
import com.godstime.HRMgtSystem.entities.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    private CityDao cityDao;
    @Autowired
    public CityServiceImpl(CityDao cityDao){
        this.cityDao = cityDao;
    }
    @Override
    public Result add(City entity) {
        cityDao.save(entity);
        return new SuccessResult("City added");
    }

    @Override
    public Result update(City entity) {
        cityDao.save(entity);
        return new SuccessResult("City updated");
    }

    @Override
    public Result delete(int id) {
        cityDao.deleteById(id);
        return new SuccessResult("City Deleted");
    }

    @Override
    public DataResult<List<City>> getAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "city");
        return new SuccessDataResult<List<City>>(cityDao.findAll(sort));
    }

    @Override
    public DataResult<City> getById(int id) {
        return new SuccessDataResult<City>(cityDao.getById(id));
    }
}
