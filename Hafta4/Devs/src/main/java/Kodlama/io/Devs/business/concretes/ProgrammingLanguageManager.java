package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {

		isNameEmpty(programmingLanguage);

		isNameExist(programmingLanguage);
		
		isIdExist(programmingLanguage);

		languageRepository.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, int index) throws Exception {

		isNameEmpty(programmingLanguage);

		isNameExist(programmingLanguage);
		
		isIdExist(programmingLanguage);

		languageRepository.update(programmingLanguage, index);
	}

	@Override
	public void remove(int id) {

		languageRepository.remove(id);
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languageRepository.getById(id);
	}

	public boolean isNameExist(ProgrammingLanguage programmingLanguage) throws Exception {

		for (ProgrammingLanguage language : languageRepository.getAll()) {
			if (language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				throw new Exception("Aynı isimde programlama dili zaten var.");
			}
		}

		return true;

	}

	public boolean isNameEmpty(ProgrammingLanguage programmingLanguage) throws Exception {

		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez.");
		}

		return true;

	}

	public boolean isIdExist(ProgrammingLanguage programmingLanguage) throws Exception {

		for (ProgrammingLanguage language : languageRepository.getAll()) {
			if (language.getId() == programmingLanguage.getId()) {
				throw new Exception("Aynı id numarasından zaten var.");
			}
		}

		return true;
	}

}
