package com.school.management.result.dao;

import java.util.List;

import com.school.management.result.model.Result;

public interface ResultDao {

	public List<Result> getAllStudentResults();
	public Result getStudentResultByRollNumber(long rollNumber);
	public Result saveStudentResult(Result result);
	
}
