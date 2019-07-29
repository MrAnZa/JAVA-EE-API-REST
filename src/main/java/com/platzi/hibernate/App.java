package com.platzi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDAOImpl;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Teacher teacher=new Teacher("Cristian","Avatar.jpeg");
        TeacherDAOImpl tdi= new TeacherDAOImpl();
        tdi.saveTeacher(teacher);
        
        List<Teacher> teachers=tdi.findAllTeachers();
        
       for(Teacher t : teachers) {
    	   System.out.println("Nombre: "+t.getName());
       }
        
    }
}
