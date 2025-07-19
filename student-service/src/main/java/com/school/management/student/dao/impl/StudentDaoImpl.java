package com.school.management.student.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.management.student.dao.StudentDao;
import com.school.management.student.repository.StudentRepository;
import com.school.management.student.model.StudentModel;


@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<StudentModel> findAllStudentDetails() {
		return studentRepository.findAll();
	}

	@Override
	public StudentModel findStudentDetailsById(long id) {
		return studentRepository.findByRollNumber(id);
	}

	@Override
	public StudentModel saveStudentDetails(StudentModel tm) {
		return studentRepository.save(tm);
	}

	@Override
	public StudentModel updateStudentDetails(StudentModel tm) {
		StudentModel studentModel = studentRepository.findByRollNumber(tm.getRollNumber());
		if(studentModel == null) {
			throw new RuntimeException("Student not found with rollNumber " + tm.getRollNumber());
		}
		return studentRepository.save(tm);
	}

}
