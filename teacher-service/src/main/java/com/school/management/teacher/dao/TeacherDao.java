package com.school.management.teacher.dao;

import java.util.List;

import com.school.management.teacher.model.TeacherModel;

public interface TeacherDao {
	
public List<TeacherModel> findAllTeacherDetails();
public TeacherModel findTeacherDetailsById(long id);
public TeacherModel saveTeacherDetails(TeacherModel tm);
public TeacherModel updateTeacherDetails(TeacherModel tm);

}
