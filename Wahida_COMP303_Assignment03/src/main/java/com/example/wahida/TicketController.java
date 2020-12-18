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
@RequestMapping("/tickets")
public class TicketController {

	private final TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	@GetMapping
	public Iterable<Ticket> all() {
		return ticketService.findAll();
	}

	@GetMapping("/{ticketId}")
	public ResponseEntity<Ticket> get(@PathVariable("ticketId") String ticketId) {
		return ticketService.find(ticketId)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping
	public ResponseEntity<Ticket> create(@RequestBody Ticket ticket,
                                     UriComponentsBuilder uriBuilder) {
	Ticket created = ticketService.create(ticket);
    URI newTicketUri = uriBuilder.path("/tickets/{ticketId}").build(created.getTicketId());
    return ResponseEntity
            .created(newTicketUri)
            .body(created);
	}
	
	@DeleteMapping("/{ticketId}")
	public void deleteFlight(@PathVariable("ticketId") String ticketId) {
		ticketService.delete(ticketId);
	}
	
}
