package polymorphismDemo;
public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi");
        /*
        Bir class'ı başka bir class içerisinde new yapmak DatabaseLogger'a körü körüne bağlandım demek. 
        Bu bağımlı bir sistem Database'ye bağımlıyız. Mesela müşterimiz Database yerine File logger 
        yapıcaz dedi bu sefer bütün kodlardan DatabaseLogger'ı silmemiz gerekecek.
         */
        
        /*DatabaseLogger logger = new DatabaseLogger();
        logger.log("Log mesajı");*/

        // Böyle yapmak daha dinamik olur.
        this.logger.log("Log mesajı");

    }
}
