package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Survey;
import com.revature.repos.SurveyRepo;
import com.revature.services.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{
	@Autowired
	private SurveyRepo surveyRepo;

	@Override
	public Survey save (Survey s) {
		s.setSurveyId(0);
				
		// If Privacy is invalid, set it to public
		if (!((s.getPrivacy() == 1) || (s.getPrivacy() == 2))) {
			s.setPrivacy(1);
		}
		
		// If Status is invalid, set it to open
		if (!((s.getStatus() == 1) || (s.getStatus() == 2))) {
			s.setStatus(1);
		}
		
		return surveyRepo.save(s);
	}

	@Override
	public Survey update(Survey s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Survey delete(Survey s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Survey> findAll() {
		// TODO Auto-generated method stub
		return surveyRepo.findAll();
	}

	@Override
	public Survey findById(int id) {
		return surveyRepo.getOne(id);
	}

	@Override
	public List<Survey> findByCreator(int creator) {
		return surveyRepo.findByCreatorUserId(creator);
	}

	@Override
	public List<Survey> findByStatus(int id) {
		return surveyRepo.findByStatusStatusId(id);
	}

	@Override
	public List<Survey> findByPrivacy(int id) {
		return surveyRepo.findByPrivacyPrivacyId(id);
	}

//	@Override
//	public List<Survey> findByCollaborator(int id) {
//		return surveyRepo.findByCollaboratorCollaboratorId(id);
//	}

}
