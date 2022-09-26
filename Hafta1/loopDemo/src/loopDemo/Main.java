package loopDemo;

//Döngü, bir programda birbirine benzeyen işlemleri tekrarlamaya yarar.

public class Main {

	public static void main(String[] args) {

		// For
		for (int i = 1; i <= 10; i++) { // i=i+1
			System.out.println(i);
		}
		
		System.out.println("For Döngü Bitti");

		// While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While Döngü Bitti");
		
		// Do-While
		// Şart sağlanmasa bile bir kere çalışır.
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("Do-While Döngü Bitti");
		
		

	}

}
