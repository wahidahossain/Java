package com.mtm.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class BookController {
	
	
	@Autowired
	BookServiceRepository bookServiceRepo;
	
	public BookController(BookServiceRepository bookServiceRepo) {
		super();
		this.bookServiceRepo = bookServiceRepo;
	}
	
	
    
}
