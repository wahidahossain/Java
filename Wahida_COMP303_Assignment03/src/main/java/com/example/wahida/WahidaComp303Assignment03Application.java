package com.example.wahida;

import java.text.SimpleDateFormat;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class WahidaComp303Assignment03Application {

	public static void main(String[] args) {
		SpringApplication.run(WahidaComp303Assignment03Application.class, args);
	}
	@Bean
	public ApplicationRunner flightsInitializer(FlightService flightService) {
    	return args -> {
    		flightService.create(new Flight(
    				"AC7646",
    				"Air Canada",
    				"Toronto Pearson International Airport (YYZ)",
    				"LaGuardia Airport (LGA)",
    				new SimpleDateFormat("hh:mm").parse("08:05"),
    				new SimpleDateFormat("hh:mm").parse("09:34"), 
    				76,
    				378));
    		flightService.create(new Flight(
    				"UA4147",
    				"United",
    				"Toronto Pearson International Airport (YYZ)",
    				"Newark Liberty International Airport (EWR)",
    				new SimpleDateFormat("hh:mm").parse("07:25"),
    				new SimpleDateFormat("hh:mm").parse("09:17"), 
    				50,458));
    		flightService.create(new Flight(
    				"WS1216",
    				"WestJet",
    				"Toronto Pearson International Airport (YYZ)",
    				"LaGuardia Airport (LGA)",
    				new SimpleDateFormat("hh:mm").parse("20:25"),
    				new SimpleDateFormat("hh:mm").parse("21:58"), 
    				162,506));
    		flightService.create(new Flight(
    				"DL5537",
    				"Delta",
    				"Toronto Pearson International Airport (YYZ)",
    				"John F. Kennedy International Airport (JFK)",
    				new SimpleDateFormat("hh:mm").parse("14:31"),
    				new SimpleDateFormat("hh:mm").parse("16:19"), 
    				63, 425));
    		flightService.create(new Flight(
    				"AA3350",
    				"American",
    				"Toronto Pearson International Airport (YYZ)",
    				"LaGuardia Airport (LGA)",
    				new SimpleDateFormat("hh:mm").parse("14:44"),
    				new SimpleDateFormat("hh:mm").parse("16:30"), 
    				76, 390));
    		};
	}

		
		@Bean
		public ApplicationRunner passengersInitializer(PassengerService passengerService) {
	    	return args -> {
	    		passengerService.create(new Passenger(
	    				"Sam",
	    				"Nelson",
	    				"334 West Coat Ave",
	    				"Toronto, ON",
	    				"Canada",
	    				"(416) 666-77777", 
	    				"Sam@gmail.com"));
	    		passengerService.create(new Passenger(
	    				"Jhon",
	    				"Bob",
	    				"322 West Side Rd",
	    				"Toronto, ON",
	    				"Canada",
	    				"(416) 555-6666", 
	    				"Jhon@gmail.com"));
	    		passengerService.create(new Passenger(
	    				"Andrew",
	    				"Smile",
	    				"202 Highland Ave",
	    				"Toronto, ON",
	    				"Canada",
	    				"(416) 000-9999", 
	    				"Andrew@gmail.com"));
	    		
	    	};

		}
		
		@Bean
		public ApplicationRunner ticketsInitializer(TicketService ticketService) {
	    	return args -> {
	    		ticketService.create(new Ticket(
	    				"1",
	    				"AC7646",
	    				new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-30"),
	    				378,
	    				"Scheduled"));
	    		ticketService.create(new Ticket(
	    				"2",
	    				"WS1216",
	    				new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-30"),
	    				506,
	    				"Scheduled"));
	    		
	    	};

		}
}