package Kodlama.io.Devs.webApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.response.GetAllTechnologiesResponse;
import Kodlama.io.Devs.entites.concretes.Technology;

@RestController
@RequestMapping("api/technology")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll() {
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}
	
	@PostMapping("/update")
	public void update(int id, CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.update(id, createTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		technologyService.delete(id);
	}
	
	@PostMapping("/getbyid")
	public Optional<Technology> getById(int id) {
		return technologyService.getById(id);
	}

}
