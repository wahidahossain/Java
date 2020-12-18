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
@RequestMapping("/passengers")
public class PassengerController {

	private final PassengerService passengerService;

	public PassengerController(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	@GetMapping
	public Iterable<Passenger> all() {
		return passengerService.findAll();
	}

	@GetMapping("/{passengerId}")
	public ResponseEntity<Passenger> get(@PathVariable("passengerId") String passengerId) {
		return passengerService.find(passengerId)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping
	public ResponseEntity<Passenger> create(@RequestBody Passenger passenger,
                                     UriComponentsBuilder uriBuilder) {
	Passenger created = passengerService.create(passenger);
    URI newPassengerUri = uriBuilder.path("/passengers/{passengerId}").build(created.getPassengerId());
    return ResponseEntity
            .created(newPassengerUri)
            .body(created);
	}
	@DeleteMapping("/{passengerId}")
	public void deleteFlight(@PathVariable("passengerId") String passengerId) {
		passengerService.delete(passengerId);
	}
	
}
