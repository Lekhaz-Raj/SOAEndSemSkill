package soa.controller;


	

	import java.util.List;

	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

import soa.model.Tourist;
import soa.service.TouristService;


	@RestController
	@RequestMapping("/api")
	public class TouristController {

	    private final TouristService touristService;

	    public TouristController(TouristService touristService) {
	        this.touristService = touristService;
	    }

	    @GetMapping("/tourists")
	    public ResponseEntity<List<Tourist>> getAllTourists() {

	        List<Tourist> tourists = touristService.getAllTourists();

	        return ResponseEntity.ok(tourists);
	    	    }
	}


