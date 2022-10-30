package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguage> getAll() {

		return languageService.getAll();
	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		
		return languageService.getById(id);
		
	}

	@GetMapping("/update")
	public void getUpdate(ProgrammingLanguage programmingLanguage, int index) throws Exception {

		languageService.update(programmingLanguage, index);
	}

	@GetMapping("/remove")
	public void getRemove(int id) {

		languageService.remove(id);

	}

}
