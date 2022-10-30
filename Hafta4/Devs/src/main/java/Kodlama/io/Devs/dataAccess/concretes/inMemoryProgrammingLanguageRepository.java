package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Repository
public class inMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public inMemoryProgrammingLanguageRepository() {

		languages = new ArrayList<ProgrammingLanguage>();

		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "C#"));
		languages.add(new ProgrammingLanguage(3, "Python"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		languages.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int index) {

		languages.set(index, programmingLanguage);


	}

	@Override
	public void remove(int id) {
		
		languages.remove(id);
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		for (ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		
		return null;
	}

}
