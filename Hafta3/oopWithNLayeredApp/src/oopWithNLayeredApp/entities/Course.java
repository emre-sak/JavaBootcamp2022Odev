package oopWithNLayeredApp.entities;

public class Course extends BaseEntity{
	
	private int price;
	
	public Course(int id, String name, int price) {
		super(id, name);
		this.price = price;
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
