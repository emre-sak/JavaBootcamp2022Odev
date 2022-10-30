package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage, int index) throws Exception;
	void remove(int id);
	ProgrammingLanguage getById(int id);
}
