package com.school.management.result.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.management.result.dao.ResultDao;
import com.school.management.result.model.Result;
import com.school.management.result.repository.ResultRepository;


@Repository
public class ResultDaoImpl implements ResultDao {
	
	@Autowired
	ResultRepository resultRepository;

	@Override
	public List<Result> getAllStudentResults() {
		return resultRepository.findAll();
	}

	@Override
	public Result getStudentResultByRollNumber(long rollNumber) {
		return resultRepository.findByRollNumber(rollNumber);
	}

	@Override
	public Result saveStudentResult(Result result) {
		return resultRepository.save(result);
	}

}
