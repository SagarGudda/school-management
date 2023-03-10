package com.school.management.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.student.dao.StudentDao;
import com.school.management.student.service.StudentService;
import com.school.management.student.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public List<StudentModel> findAllStudentDetails() {
		return studentDao.findAllStudentDetails();
	}

	@Override
	public StudentModel findStudentDetailsById(long id) {
		return studentDao.findStudentDetailsById(id);
	}

	@Override
	public StudentModel saveStudentDetails(StudentModel tm) {
		return studentDao.saveStudentDetails(tm);
	}

	@Override
	public StudentModel updateStudentDetails(StudentModel tm) {
		return studentDao.updateStudentDetails(tm);
	}

}
