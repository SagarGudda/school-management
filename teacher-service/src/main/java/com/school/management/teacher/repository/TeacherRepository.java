package com.school.management.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.teacher.model.TeacherModel;

public interface TeacherRepository extends JpaRepository<TeacherModel, Long>{
	
	public TeacherModel findByRegistrationNumber(long id);
	

}
