package interfaces;

/*
Dal = Data Access Layer. Bugüne kadar biz hep manager kullandık manager bizim iş kodlarını yazdığı
mız yerlerdir. Veritabanıyla ilgili operasyonları da dal'a yazarız. Aynı zamanda da  extends edebi
lir. */
public class MySqlCustomerDal implements ICustomersDal, IRepository{

    @Override
    public void add() {
        System.out.println("MySql Eklendi.");
    }
}
