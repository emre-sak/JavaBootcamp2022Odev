package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.BaseEntity;

public class JdbcDatabaseDao implements BaseDatabase{

	@Override
	public void add(BaseEntity entity) {
		
		System.out.println("Jdbc ile veritabanına eklendi.");
		
	}

}
