package com.school.management.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.student.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Long>{
	
	public StudentModel findByRollNumber(long id);
	

}
