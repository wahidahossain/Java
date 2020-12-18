package com.example.wahida;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class FlightService{
	
	private final Map<String, Flight> flights = new ConcurrentHashMap<>();


	public Iterable<Flight> findAll() {
		return flights.values();
	}


	public Flight create(Flight instance) {
		flights.put(instance.getFlightId(), instance);
		return instance;
	}


	public Optional<Flight> find(String id) {
		return Optional.ofNullable(flights.get(id));
	}
	
	public void delete(String id) {
		flights.remove(id);
	}

}
