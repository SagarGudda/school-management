package com.school.management.classroutine.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.management.classroutine.dao.ClassRoutineDao;
import com.school.management.classroutine.model.ClassRoutine;
import com.school.management.classroutine.repository.ClassRoutineRepository;


@Repository
public class ClassRoutineDaoImpl implements ClassRoutineDao {
	
	@Autowired
	ClassRoutineRepository classRoutineRepository;

	@Override
	public List<ClassRoutine> getAllClassRoutine() {
		return classRoutineRepository.findAll();
	}

	@Override
	public ClassRoutine getClassRoutineByDay(String day) {
		return classRoutineRepository.findByDay(day);
	}

	@Override
	public ClassRoutine addClassRoutine(ClassRoutine classRoutine) {
		return classRoutineRepository.save(classRoutine);
	}

}
