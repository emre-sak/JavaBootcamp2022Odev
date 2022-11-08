package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.response.GetAllLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	
	List<ProgrammingLanguage> programmingLanguages;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {

		programmingLanguages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

		for (ProgrammingLanguage languages : programmingLanguages) {
			GetAllLanguagesResponse getAllLanguagesResponse = new GetAllLanguagesResponse();
			getAllLanguagesResponse.setId(languages.getId());
			getAllLanguagesResponse.setName(languages.getName());
			languagesResponse.add(getAllLanguagesResponse);
		}

		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {

		//programmingLanguages = languageRepository.findAll();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();

		isNameEmpty(createLanguageRequest);
		isNameExist(createLanguageRequest);

		programmingLanguage.setName(createLanguageRequest.getName());
		this.languageRepository.save(programmingLanguage);

	}

	@Override
	public void delete(int id) {

		this.languageRepository.deleteById(id);

	}

	@Override
	public void update(int id, CreateLanguageRequest createLanguageRequest) throws Exception {

		programmingLanguages = languageRepository.findAll();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		isNameEmpty(createLanguageRequest);
		isNameExist(createLanguageRequest);

		for (ProgrammingLanguage languages : programmingLanguages) {
			if (id == languages.getId()) {
				languages.setName(createLanguageRequest.getName());
				this.languageRepository.save(programmingLanguage);
			}
		}
		

	}

	@Override
	public Optional<ProgrammingLanguage> getById(int id) {

		return languageRepository.findById(id);

	}

	public boolean isNameExist(CreateLanguageRequest createLanguageRequest) throws Exception {

		programmingLanguages = languageRepository.findAll();
		for (ProgrammingLanguage language : programmingLanguages) {
			if (language.getName().equalsIgnoreCase(createLanguageRequest.getName())) {
				throw new Exception("Aynı isimde programlama dili zaten var.");
			}
		}

		return true;

	}

	public boolean isNameEmpty(CreateLanguageRequest createLanguageRequest) throws Exception {

		if (createLanguageRequest.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez.");
		}

		return true;

	}

}
