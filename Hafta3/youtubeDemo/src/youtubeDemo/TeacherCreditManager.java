package youtubeDemo;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		
		System.out.println("Öğretmen kredisi hesaplandı.");
		
	}

	@Override
	public void save() {
		// Mesela öğretmen kredisinde extra bir şey yapmak istedik.
		super.save();
		// Extra işlemler.
	}

	
}
