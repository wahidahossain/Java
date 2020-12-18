package com.mtm.ticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;


@Controller
public class ApplicationController {
	
	private final BookServiceRepository bookServiceRepo;
	//private Movie movie;
	
	@RequestMapping("/")
    public String home()
    {
        return "index";
    }
	

	public ApplicationController(BookServiceRepository bookServiceRepo) {
		this.bookServiceRepo = bookServiceRepo;

	}
	

	// Save data into table ------------------------------------------
	@PostMapping("/saveBook")
    public String saveBook(@ModelAttribute Book book, Model model)
    {	
		book.setBookId((int)(bookServiceRepo.count()+1));
		bookServiceRepo.save(book);
		return "index";
		
    }
	// fetch data from table ------------------------------------------
	@RequestMapping("/showBookLists")
    public String showBookLists(Model model)
    {
        model.addAttribute("books", bookServiceRepo.findAll());
        return "showBookList";
    }
	
	// Del data from table according to ID ------------------------------------------
	@DeleteMapping("/showBookList/{bookid}")
	public String delete(@PathVariable int bookid) {
	//	bookServiceRepo.delete(bookid);
		return "Book Deleted From the List!";
	}
	

/*	 
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

*/		 	
	    
}
