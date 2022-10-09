package interfaces;

public class Main {
	 /*
    İterfaceler class sayılmazlar ama classlar gibi referans tutabilirler. Operasyonlarımızın 
    içerisinde temel anlamda tamamlanmamış operasyonlar içeriyoruz. İnterfaceler inherit değil 
    implementasyon olarak kabul ediliyor. Bir class birden fazla interfaceyi implement edebiliyor. 
    Sadece referans tutucu görevi görürler. Interfaceler newlenemezler. Operasyonu implemente edil
    mesini istenen durumlarda yani onu kim implemente edecekse siz  onu ayrıca implemente etsin 
    diyorsak o zaman interface'den yararlanıyoruz. Yazılım projelerinde katmanlar vardır. Arayüz 
    kodları ayrı yere, iş katmanları (managerler) ayrı yere, veri erişim(Data access). Bu katmanların 
    geçişlerini interfacelerle yaparız çünkü bağımlılıkları önlemek için. İmplements'in anlamı, 
    bir class birden fazla interfaceyi implement edebilir.
     */
    public static void main(String[] args) {
        //Polymorphisim
        //ICustomersDal CustomerDal = new OracleCustomerDal();
        //Veritabanı olarak oracle'yi seçtik. Sil, ekle, güncelleme işlemleri oracle ile çağrılacak.
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }

}
