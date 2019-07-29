package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public class TeacherDAOImpl extends PlatziSession implements TeacherDAO{

	private PlatziSession platzisession; 
	
	public TeacherDAOImpl() {
		platzisession= new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		platzisession.getSession().persist(teacher);
		platzisession.getSession().getTransaction().commit();
		
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return platzisession.getSession().createQuery("from Teacher").list();
	}

	public void deleteTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public Teacher findTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findTeacherByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
