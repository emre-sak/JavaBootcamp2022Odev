package classes;

public class Main {

	  /* Classların ilk ve temel özelliği gruplandırma yapmaktır. Classlar referans  tiptir. Java'da iş yapan
	   her şey classtır. */
	 
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(); 														
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();

		// Değer(value) tipler veya primitiv tipler - Referans tipler.
		// Değer tipler bellekte sadece Stack bölümünde oluşur. Heopla bağlantısı yok.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		// Diziler referans tiptir.
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1; // 2 tane değişken 1 nesneyi tutuyor.
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}
}
