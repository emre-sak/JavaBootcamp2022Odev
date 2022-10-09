package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		// Örneğini oluşturmak, instance oluşturmak, instance creation. Customer
		customer = new Customer();
		customer.setId(1);
		customer.setCity("İstanbul");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.setCompanyName("Arçelik");
		company.setTaxNumber("100000");
		company.setId(100);

		Person person = new Person();
		person.setFirstName("Emre");
		person.setLastName("Sak");
		person.setNationalIdentity("123456");

		CustomerManager customerManager2 = new CustomerManager(company);

		Customer customer1 = new Customer();
		Customer customer2 = new Company();
		Customer customer3 = new Person(); 
		
		*/

		CustomerManager customerManager = new CustomerManager(new Customer(), 
				new TeacherCreditManager());
		customerManager.giveCredit();

	}

}
