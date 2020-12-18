package com.example.wahida;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/flights")
public class FlightController {
	private final FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping
	public Iterable<Flight> all() {
		return flightService.findAll();
	}

	@GetMapping("/{flightId}")
	public ResponseEntity<Flight> get(@PathVariable("flightId") String flightId) {
		return flightService.find(flightId)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping
	public ResponseEntity<Flight> create(@RequestBody Flight flight,
                                     UriComponentsBuilder uriBuilder) {
		Flight created = flightService.create(flight);
    URI newFlightUri = uriBuilder.path("/flights/{flightId}").build(created.getFlightId());
    return ResponseEntity
            .created(newFlightUri)
            .body(created);
	}
	
	@DeleteMapping("/{flightId}")
	public void deleteFlight(@PathVariable("flightId") String flightId) {
		flightService.delete(flightId);
	}

}
