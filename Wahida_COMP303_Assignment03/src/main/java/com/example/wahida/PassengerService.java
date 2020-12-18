package com.example.wahida;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class PassengerService {
	
	private final Map<String, Passenger> passengers = new ConcurrentHashMap<>();


	public Iterable<Passenger> findAll() {
		return passengers.values();
	}

	public Passenger create(Passenger instance) {
		passengers.put(instance.getPassengerId(), instance);
		return instance;
	}

	public Optional<Passenger> find(String id) {
		return Optional.ofNullable(passengers.get(id));
	}
	
	public void delete(String id) {
		passengers.remove(id);
	}
}
