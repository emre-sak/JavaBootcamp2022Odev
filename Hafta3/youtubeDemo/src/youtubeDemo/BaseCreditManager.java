package youtubeDemo;

public abstract class BaseCreditManager implements ICreditManager{
	
	public abstract void calculate(); // Ortak değil her yerde değişken.
	
	public void save() {
		System.out.println("Kaydedildi.");
	}
	
}
