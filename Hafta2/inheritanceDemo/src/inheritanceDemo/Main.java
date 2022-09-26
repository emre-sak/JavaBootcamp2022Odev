package inheritanceDemo;

// Yazdığımız program değişime direnmeyecek. Birbirlerinin alternatifi olan geçişler yapmak için if kullanılmaz.

public class Main {

	public static void main(String[] args) {
		
//      OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//      ogretmenKrediManager.Hesapla();

      KrediUI krediUI  = new KrediUI();
      //İstersek Öğretmen, tarım, asker gönderebiliriz.
      /* BaseKrediManager, OgretmenKrediManager; TarımKrediManager ve AskerKrediManager'in annesi. Biz anneyi verip çocuklarından iste
      diğimizi yollayabiliriz bunu referans tip olması yapıyor. */
      krediUI.krediHesapla(new OgretmenKrediManager());

	}

}
