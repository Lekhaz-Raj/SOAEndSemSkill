package soa.service;



	

	import java.util.List;

	import org.springframework.stereotype.Service;

import soa.model.Tourist;
import soa.repo.TouristRepository;

	

	@Service
	public class TouristService {

	    private final TouristRepository touristRepository;

	    public TouristService(TouristRepository touristRepository) {
	        this.touristRepository = touristRepository;
	    }

	    public List<Tourist> getAllTourists() {
	        return touristRepository.findAll();
	    }
	}

