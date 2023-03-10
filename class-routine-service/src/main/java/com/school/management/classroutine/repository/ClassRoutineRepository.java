package com.school.management.classroutine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.classroutine.model.ClassRoutine;

public interface ClassRoutineRepository extends JpaRepository<ClassRoutine, Long>{

	ClassRoutine findByDay(String day);
}
