package com.school.management.teacher.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.management.teacher.dao.TeacherDao;
import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.repository.TeacherRepository;


@Repository
public class TeacherDaoImpl implements TeacherDao {
	
	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public List<TeacherModel> findAllTeacherDetails() {
		return teacherRepository.findAll();
	}

	@Override
	public TeacherModel findTeacherDetailsById(long id) {
		return teacherRepository.findByRegistrationNumber(id);
	}

	@Override
	public TeacherModel saveTeacherDetails(TeacherModel tm) {
		return teacherRepository.save(tm);
	}

	@Override
	public TeacherModel updateTeacherDetails(TeacherModel tm) {
		return teacherRepository.save(tm);
	}

}
