package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		//ogrenciler[5] = "Ali"; Dizilerde sınırları aştığımız zaman hata alırız.
		
		for (int i = 0; i < ogrenciler.length; i++) { // length, ogrencilerin eleman sayısına kadar.
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("----------------------------");
		
		for(String ogrenci : ogrenciler) { // ogrenciler dizisindeki her bir elemanı gez.
			System.out.println(ogrenci);
		}

	}

}
