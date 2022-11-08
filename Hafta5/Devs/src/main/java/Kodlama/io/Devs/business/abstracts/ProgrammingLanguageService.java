package Kodlama.io.Devs.business.abstracts;

import java.util.List;
import java.util.Optional;

import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.response.GetAllLanguagesResponse;
import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<GetAllLanguagesResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void update(int id, CreateLanguageRequest createLanguageRequest) throws Exception;
	void delete(int id);
	Optional<ProgrammingLanguage> getById(int id);
}
