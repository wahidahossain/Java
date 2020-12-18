package com.example.wahida;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;


@Controller
public class ApplicationController {
	private final PassengerService passengerService;
	private final FlightService flightService;
	private final TicketService ticketService;
	private Passenger regPassenger;
	
	@RequestMapping("/")
    public String home()
    {
        return "index";
    }
	

	public ApplicationController(PassengerService passengerService, FlightService flightService, TicketService ticketService) {
		this.passengerService = passengerService;
		this.flightService = flightService;
		this.ticketService = ticketService;
	}
	
	 @PostMapping("/save")
    public String savePassenger(@ModelAttribute Passenger passenger, Model model)
    {	passengerService.create(passenger);
    	regPassenger = passenger;
    	model.addAttribute("passenger", passenger);
	    model.addAttribute("flights", flightService.findAll());
		return "flights";
    }
	 
	 @PostMapping("/createTicket")
    public String createTicket(@RequestParam String flightId, @RequestParam String departureDate, Model model)
    {
		 try {
			 Optional<Flight> selectedflight = flightService.find(flightId);
			 if (selectedflight.isPresent()) {
			 Ticket ticket = new Ticket(regPassenger.getPassengerId(),flightId,
							 new SimpleDateFormat("yyyy-MM-dd").parse(departureDate),
							 selectedflight.get().getPrice(),"Scheduled");
			 ticketService.create(ticket);
			 model.addAttribute("passenger", regPassenger);
			 model.addAttribute("flight", selectedflight.get());
			 model.addAttribute("ticket", ticket);
			 return "ticketConfirmation";
			 }
			 
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	model.addAttribute("passenger", regPassenger);
		    model.addAttribute("flights", flightService.findAll());
			return "flights";
	 }

		 	
	    
}
