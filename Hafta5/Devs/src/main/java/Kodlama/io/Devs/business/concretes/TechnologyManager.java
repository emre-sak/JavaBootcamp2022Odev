package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.response.GetAllTechnologiesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entites.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	
	private TechnologyRepository technologyRepository;
	List<Technology> technologies;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		
		technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> getAllTechnologiesResponses = 
				new ArrayList<GetAllTechnologiesResponse>();
		
		for(Technology technology : technologies) {
			
			GetAllTechnologiesResponse getAllTechnologiesResponse = new GetAllTechnologiesResponse();
			getAllTechnologiesResponse.setId(technology.getId());
			getAllTechnologiesResponse.setName(technology.getName());
			getAllTechnologiesResponses.add(getAllTechnologiesResponse);
			
		}
		
		return getAllTechnologiesResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		Technology technology = new Technology();
		
		isNameEmpty(createTechnologyRequest);
		isNameExist(createTechnologyRequest);
		
		technology.setName(createTechnologyRequest.getName());
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void update(int id, CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		technologies = technologyRepository.findAll();
		Technology technology = new Technology();
		
		isNameEmpty(createTechnologyRequest);
		isNameExist(createTechnologyRequest);
		
		for (Technology technology_ : technologies) {
			if (id == technology_.getId()) {
				technology_.setName(createTechnologyRequest.getName());
				this.technologyRepository.save(technology);
			}
		}
		
	}

	@Override
	public void delete(int id) {
		
		this.technologyRepository.deleteById(id);
		
	}

	@Override
	public Optional<Technology> getById(int id) {
		return technologyRepository.findById(id);
	}
	
	public boolean isNameExist(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		technologies = technologyRepository.findAll();
		for (Technology technology : technologies) {
			if (technology.getName().equalsIgnoreCase(createTechnologyRequest.getName())) {
				throw new Exception("Aynı isimde teknoloji zaten var.");
			}
		}

		return true;

	}

	public boolean isNameEmpty(CreateTechnologyRequest createTechnologyRequest) throws Exception {

		if (createTechnologyRequest.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez.");
		}

		return true;

	}

}
