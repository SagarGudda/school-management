package com.school.management.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.school.management.teacher.dao.impl.TeacherDaoImpl;
import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.repository.TeacherRepository;

@ExtendWith(MockitoExtension.class)
public class TeacherDaoTest {

	
	@Mock
	TeacherRepository teacherRepository;
	
	@InjectMocks
	TeacherDaoImpl teacherDaoImpl;
	
	@BeforeEach
	public void setup() {
		when(teacherRepository.findAll()).thenReturn(getListOfTeachers());
	}
	
	private List<TeacherModel> getListOfTeachers(){
		List<TeacherModel> tml=new ArrayList<TeacherModel>();
		TeacherModel tmodel=new TeacherModel();
		tmodel.setId(1);
		tmodel.setName("sagar");
		tml.add(tmodel);
		return tml;
	}
	
	@Test
	public void testGetAllTeachersTest() {
		List<TeacherModel> tml=teacherDaoImpl.findAllTeacherDetails();
		assertEquals("sagar", tml.get(0).getName());
	}
}
