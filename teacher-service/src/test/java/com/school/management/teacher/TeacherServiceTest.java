package com.school.management.teacher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.school.management.teacher.dao.TeacherDao;
import com.school.management.teacher.model.TeacherModel;
import com.school.management.teacher.service.impl.TeacherServiceImpl;

@SpringBootTest
public class TeacherServiceTest {

	@MockBean
	TeacherDao teacherDao;
	
	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	@BeforeEach
	public void setup() {
		when(teacherDao.findAllTeacherDetails()).thenReturn(getListOfTeachers());
	}
	
	private List<TeacherModel> getListOfTeachers(){
		List<TeacherModel> tml=new ArrayList<TeacherModel>();
		TeacherModel tmodel=new TeacherModel();
		tmodel.setId(2);
		tmodel.setName("sagar");
		tml.add(tmodel);
		return tml;
	}
	
	@Test
	public void testGetAllTeachers() {
	List<TeacherModel> tml=	teacherServiceImpl.findAllTeacherDetails();
	assertEquals(2, tml.get(0).getId());
	}
}
