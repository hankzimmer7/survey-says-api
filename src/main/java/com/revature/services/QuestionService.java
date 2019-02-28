package com.revature.services;

import java.util.List;

import com.revature.model.Question;

public interface QuestionService {

	List<Question> findAll();

	Question findById(int id);

	List<Question> findBySurvey(int id);

	List<Question> findByType(int id);

	Question save(Question q);
}
