package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.BaseEntity;

public class HibernateDatabaseDao implements BaseDatabase{

	@Override
	public void add(BaseEntity entity) {
		
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
