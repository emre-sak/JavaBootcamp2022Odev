package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		int sayi = 0;
		
		for(int bul : sayilar) {
			
			if(bul == aranacak) {
				sayi = bul;
				break;
			}
			
		}
		
		if(sayi == aranacak) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
