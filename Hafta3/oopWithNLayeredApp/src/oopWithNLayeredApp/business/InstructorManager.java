package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.BaseDatabase;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private BaseDatabase baseDatabase;
	private ArrayList<Logger> loggers;
	
	public InstructorManager(BaseDatabase baseDatabase, ArrayList<Logger> loggers) {
		this.baseDatabase = baseDatabase;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		
		baseDatabase.add(instructor);
		System.out.println("Eğitmen eklendi : " + instructor.getName() + " " 
		+ instructor.getLastName());
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName() + " " + instructor.getLastName());
		}
		
	}
}
