package com.example.wahida;

public class IdGenerator {
	private static int passengerCounter = 0;
	private static int ticketCounter = 0;

	String getPassengerId() 
    {
    	passengerCounter++;
        return String.valueOf(passengerCounter);
    }
	String getTicketId() 
    {
    	ticketCounter++;
        return String.valueOf(ticketCounter);
    }
}
