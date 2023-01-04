package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.models.Image;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService extends BaseEntityService<Image>{

    Result upload(int userId, MultipartFile file);

    DataResult<Image> getByUserId(int userId);

}
