package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage, int index);
	void remove(int id);
	ProgrammingLanguage getById(int id);
	
}
