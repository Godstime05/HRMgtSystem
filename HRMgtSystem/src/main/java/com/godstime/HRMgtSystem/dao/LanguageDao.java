package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language, Integer> {
}
