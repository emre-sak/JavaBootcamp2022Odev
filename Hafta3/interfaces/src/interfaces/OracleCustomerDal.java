package interfaces;

public class OracleCustomerDal implements ICustomersDal{

    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
