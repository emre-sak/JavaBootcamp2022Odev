package oopWithNLayeredApp.entities;

public class Instructor extends BaseEntity{
	
	private String lastName;

	public Instructor(int id, String name, String lastName) {
		super(id, name);
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
