package oopWithNLayeredApp;

import java.util.ArrayList;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.InstructorManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateDatabaseDao;
import oopWithNLayeredApp.dataAccess.JdbcDatabaseDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		Instructor instructor2 = new Instructor(2, "Emre", "Sak");
		
		Category category = new Category(1, "Backend");
		Category category2 = new Category(2, "Frontend");
		ArrayList<Category> categories = new ArrayList<Category>();
		
		
		Course course = new Course(1, "Java", 100);
		Course course2 = new Course(2, "JavaScript", 200);
		ArrayList<Course> courses = new ArrayList<Course>();
		
		ArrayList<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger()); 
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		 
		
		InstructorManager instructorManager = new InstructorManager(new JdbcDatabaseDao(), 
				loggers);
		instructorManager.add(instructor);
		
		InstructorManager instructorManager2 = new InstructorManager(new HibernateDatabaseDao(), 
				loggers);
		instructorManager2.add(instructor2);
		
		CategoryManager categoryManager = new CategoryManager(new JdbcDatabaseDao(), 
				loggers, categories);
		categoryManager.add(category);
		
		CategoryManager categoryManager2 = new CategoryManager(new HibernateDatabaseDao(), 
				loggers, categories);
		categoryManager2.add(category2);
		
		CourseManager courseManager = new CourseManager(new JdbcDatabaseDao(), loggers, courses);
		courseManager.add(course);
		
		CourseManager courseManager2 = new CourseManager(new HibernateDatabaseDao(), loggers, courses);
		courseManager2.add(course2);
		
		
	}

}