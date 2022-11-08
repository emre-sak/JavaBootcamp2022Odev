package Kodlama.io.Devs.business.abstracts;

import java.util.List;
import java.util.Optional;

import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.response.GetAllTechnologiesResponse;
import Kodlama.io.Devs.entites.concretes.Technology;

public interface TechnologyService {
	List<GetAllTechnologiesResponse> getAll();
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void update(int id, CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void delete(int id);
	Optional<Technology> getById(int id);
}
