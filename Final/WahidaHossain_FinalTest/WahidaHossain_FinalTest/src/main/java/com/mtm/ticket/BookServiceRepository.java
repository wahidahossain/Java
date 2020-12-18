package com.mtm.ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookServiceRepository extends JpaRepository<Book, Integer>
{

	//void addAttribute(String string, List<Book> findAll);


}
