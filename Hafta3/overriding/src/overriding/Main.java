package overriding;

public class Main {

	/*
    Java'da temel operasyonlar yanı bir class'ın herhangi bir operasyonu biz aksini belirtmediğimiz 
    sürece overridable yani üzerine yazılabilir. BaseKrediManager veya herhangi bir class'ı inherit 
    eden başka bir class onu ezebilir.
     */
    public static void main(String[] args) {
        /* OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000)); */

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }

}
