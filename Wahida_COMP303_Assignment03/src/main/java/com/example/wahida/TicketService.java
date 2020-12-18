package com.example.wahida;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class TicketService{
	
	private final Map<String, Ticket> tickets = new ConcurrentHashMap<>();

	public Iterable<Ticket> findAll() {
		return tickets.values();
	}


	public Ticket create(Ticket instance) {
		tickets.put(String.valueOf(instance.getTicketId()), instance);
		return instance;
	}


	public Optional<Ticket> find(String id) {
		return Optional.ofNullable(tickets.get(id));
	}
	
	public void delete(String id) {
		tickets.remove(id);
	}

	
}