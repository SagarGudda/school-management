package com.school.management.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.teacher.dao.TeacherDao;
import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherDao teacherDao;

	@Override
	public List<TeacherModel> findAllTeacherDetails() {
		return teacherDao.findAllTeacherDetails();
	}

	@Override
	public TeacherModel findTeacherDetailsById(long id) {
		return teacherDao.findTeacherDetailsById(id);
	}

	@Override
	public TeacherModel saveTeacherDetails(TeacherModel tm) {
		return teacherDao.saveTeacherDetails(tm);
	}

	@Override
	public TeacherModel updateTeacherDetails(TeacherModel tm) {
		return teacherDao.updateTeacherDetails(tm);
	}

}
