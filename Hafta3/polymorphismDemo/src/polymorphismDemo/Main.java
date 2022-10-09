package polymorphismDemo;
/*
Çok biçimcilik demektir. Referans tiplerin birbirlerinin (arada inheritance varsa) referansını 
tutması itibari ile olan durumdur.
 */
public class Main {
    public static void main(String[] args) {
        /* EmailLogger emailLogger = new EmailLogger();
           emailLogger.Log("Log mesajı."); */

        /*Bu yöntemle kullanırsak ilerde yeni Logger eklemek çok kolaylaşacak. Mesela ConsoleLogger'ı 
          sonradan ekledik. Ya da çıkartmak istersek diziden kolayca çıkartabiliriz. Buna 
          polymorphism deniyor. */

       /* BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger : loggers) {
            logger.log("Log mesajı.");
        } */

        //DatabaseLoglamayı kaldırıyoruz dendiğinde FileLogger'ı yazabiliriz.
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

        }
    }

