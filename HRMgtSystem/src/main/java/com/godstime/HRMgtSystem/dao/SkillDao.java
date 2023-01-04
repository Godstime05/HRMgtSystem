package com.godstime.HRMgtSystem.dao;

import com.godstime.HRMgtSystem.entities.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillDao extends JpaRepository<Skill, Integer> {
}
