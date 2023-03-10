package com.school.management.student.service;

import java.util.List;

import com.school.management.student.model.StudentModel;

public interface StudentService {
	
	public List<StudentModel> findAllStudentDetails();
	public StudentModel findStudentDetailsById(long id);
	public StudentModel saveStudentDetails(StudentModel tm);
	public StudentModel updateStudentDetails(StudentModel tm);

}
