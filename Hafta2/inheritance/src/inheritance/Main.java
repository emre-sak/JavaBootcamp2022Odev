package inheritance;
// İki nesne arasında miras durumu.
public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
        customer.age = 24; //Diğer özelliklerde çıkıyor.

        Employee employee = new Employee();
        employee.firstName = "Emre"; //Diğer özelliklerde çıkıyor.

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager  = new CustomerManager();

        customerManager.add(); //Diğer metotlarda çıkar.
        employeeManager.bestEmployee(); //Diğer metotlarda çıkar.
        
	}

}
