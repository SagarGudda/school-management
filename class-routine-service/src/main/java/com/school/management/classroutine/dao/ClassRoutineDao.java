package com.school.management.classroutine.dao;

import java.util.List;

import com.school.management.classroutine.model.ClassRoutine;

public interface ClassRoutineDao {
	
	List<ClassRoutine> getAllClassRoutine();
	ClassRoutine getClassRoutineByDay(String day);
	
	ClassRoutine addClassRoutine(ClassRoutine classRoutine);

}
