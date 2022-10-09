package interfaces;

public class CustomerManager {

    private ICustomersDal customerDal;

    public CustomerManager(ICustomersDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // iş kodları yazılır.
        //CustomerManager'ın CustomerDal'ı var ve biz onun add'ini çağıracağız.
        customerDal.add();
    }
}
