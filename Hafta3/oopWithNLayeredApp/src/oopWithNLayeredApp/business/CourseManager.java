package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.BaseDatabase;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {
	
	private BaseDatabase baseDatabase;
	private ArrayList<Logger> loggers;
	private ArrayList<Course> courseList;
	
	public CourseManager(BaseDatabase baseDatabase, ArrayList<Logger> loggers, ArrayList<Course> courseList) {
		this.baseDatabase = baseDatabase;
		this.loggers = loggers;
		this.courseList = courseList;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}
		
		for (Course crslst : courseList) {
			if(crslst.getName().contains(course.getName())) {
				throw new Exception("Bu kurstan zaten var.");
			}
		}
		
		baseDatabase.add(course);
		courseList.add(course);
		System.out.println("Kurs eklendi : " + course.getName());
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
	
	

}
