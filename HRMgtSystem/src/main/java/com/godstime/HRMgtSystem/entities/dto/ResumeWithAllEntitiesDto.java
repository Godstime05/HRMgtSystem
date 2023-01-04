package com.godstime.HRMgtSystem.entities.dto;

import com.godstime.HRMgtSystem.entities.models.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeWithAllEntitiesDto {
    private int id;

    private LocalDateTime creationDate;

    private Candidate candidate;

    private CoverLetter coverLetter;

    private Image image;

    private List<Education> educations;

    private List<Experience> experiences;

    private List<LanguageLevel> languageLevels;

    private List<Link> links;

    private List<Skill> skills;
}
