package polymorphismDemo;
public class BaseLogger {
    /*
     Mesela bütün operasyonlar için ortak bir kodumuz vardır onu çalıştırırız.
     */
    public void log(String message) {
        System.out.println("Default logger : " + message);
    }
}
