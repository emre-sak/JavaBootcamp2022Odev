package abstractDemo;

public class Main {
	/*
    Yazılım geliştirme prensiplerinin SOLİD'in O = Bir sisteme(sistem bizim programımız) yeni bir 
    özellik getirildiğinde mevcuttaki hiçbir kodu değiştiremezsin. Mesela MySql desteği gelebilir 
    sonradan. */
    public static void main(String[] args) {
        CustomerManager customerManager  = new CustomerManager();
        /* Böyle bir kullanım sıkıntılı. Çalıştırırsak hata alırız. Çünkü ortada newlenmiş bir şey yok.
        customerManager.getCustomers(); */

        /*Doğru kullanım noktası bu. Sistemi hangi veritabanına çekmek istersek burda değiştirebiliriz. 
        Biz sadece konfigurasyonu değiştiriyoruz. */
        // new SqlServerDatabaseManager(); de yazabiliriz.
        customerManager.baseDatabaseManager = new OracleDatabaseManager(); 
        customerManager.getCustomers();
    }

}
