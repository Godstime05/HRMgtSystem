package com.godstime.HRMgtSystem.base.domain;

import com.godstime.HRMgtSystem.base.utilities.results.DataResult;
import com.godstime.HRMgtSystem.base.utilities.results.Result;
import com.godstime.HRMgtSystem.entities.dto.ResumeWithAllEntitiesDto;
import com.godstime.HRMgtSystem.entities.models.Resume;

import java.util.List;

public interface ResumeService extends BaseEntityService<Resume>{

    Result addCoverLetterToResume(int resumeId, int coverLetterId);

    Result deleteCoverLetterFromResume(int resumeId);

    DataResult<List<ResumeWithAllEntitiesDto>> getAllResumesDetailsByActivatedCandidate();

    DataResult<Resume> getByCandidateId(int candidateId);

    DataResult<ResumeWithAllEntitiesDto> getResumeDetailsByCandidateId(int candidateId);

}
