package com.school.management.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.result.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long>{
	
	public Result findByRollNumber(long rollNumber);

}
