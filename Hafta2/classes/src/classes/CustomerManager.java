package classes;

public class CustomerManager { // Müşteriyle ilgili ne yapacaksak onları koyuyoruz.

	// Manager ifadesi bir katman ismidir. Manager ifadesi genellikle operasyon bazlı şeyler için kullanılır.

	public void add() {
		System.out.println("Müşteri Eklendi.");
	}

	public void remove() {
		System.out.println("Müşteri Silindi.");
	}

	public void update() {
		System.out.println("Müşteri Güncellendi.");
	}
}
