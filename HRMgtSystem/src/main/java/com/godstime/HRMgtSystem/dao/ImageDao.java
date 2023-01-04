package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Integer> {
    Image getByUserId(int userId);
}
