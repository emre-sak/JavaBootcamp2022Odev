package Kodlama.io.Devs.webApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.business.response.GetAllLanguagesResponse;
import Kodlama.io.Devs.entites.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {

		return languageService.getAll();
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.add(createLanguageRequest);
	}
	
	@PostMapping("/update")
	public void update(int id, CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.update(id, createLanguageRequest);
	}
	
	@PostMapping("/getbyid")
	public Optional<ProgrammingLanguage> getById(int id) {
		return languageService.getById(id);
	}
	
	
	

}
