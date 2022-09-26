package stringsDemo;

public class Main {

	public static void main(String[] args) {

		//Stringler bir karakter dizisidir.
        String mesaj = "Bugün Hava Çok Güzel.";
        System.out.println("Karakter Sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); //String birleştirme
        System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true, başlamıyorsa false.
        System.out.println(mesaj.endsWith(".")); //. ile bitiyorsa true, bitmiyorsa false.
        char[] karakterler = new char[5];
        // Bugünün ilk 5 karakterini almak istiyoruz. 
        mesaj.getChars(0,5,karakterler,0); //Başlangıç, bitiş, char[], karakterler dizisinin 0.index'inden itibaren aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //Kaçıncı indexte? Metinde arayabiliriz ör : "av".
        System.out.println(mesaj.lastIndexOf('a')); //Kaçıncı indexte? Sondan başlar aramaya.

        System.out.println(mesaj.replace(' ','-')); //Değiştirme. Boşlukları düz çizgi ile değiştirdik.
        System.out.println(mesaj.substring(2)); //Bir metnin içerisinden parça almak. 2.indexten itibaren aldık.
        System.out.println(mesaj.substring(2,5)); //2'den 5'e kadar kes. 5 dahil değil.
        //Bir metni belli bir karekter veya karekter dizisini dikkate alarak parçalar. Boşluğa göre parçaladık.
        for(String kelime:mesaj.split(" ")) {
            System.out.println(kelime);
        }

        /* Mesela bunları veritabanına arama ifadesi gönderdiğimizde kullanırız. Veritabanlarında büyük-küçük harf duyar
           lıysa biz arama ifadesini tamamen küçük harfe çeviririz. Hem arama ifadesini hem de karşı datayı küçük harfe 
           çevirebiliriz. */
        System.out.println(mesaj.toLowerCase()); //Kelimenin bütün harfini küçültür.
        System.out.println(mesaj.toUpperCase()); //Kelimenin bütün harfini büyültür.
        System.out.println(mesaj.trim()); //Başta veya sonda boşluklar varsa onları atıyor.

	}

}
