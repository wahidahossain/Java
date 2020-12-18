package com.example.wahida;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Ticket {
	
	private String passengerId;
	private String flightId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date departureDate;
	private double amountPaid;
	private String status;
	private String ticketId;
	

	public Ticket(String passengerId, String flightId, Date departureDate, double amountPaid, String status) {
		super();
		this.passengerId = passengerId;
		this.flightId = flightId;
		this.departureDate = departureDate;
		this.amountPaid = amountPaid;
		this.status = status;
		ticketId = new IdGenerator().getTicketId();
	}
	
	public String getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}


	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}


	public Date getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}


	public double getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTicketId() {
		return ticketId;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ticketId == null) ? 0 : ticketId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (ticketId == null) {
			if (other.ticketId != null)
				return false;
		} else if (!ticketId.equals(other.ticketId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket: passengerId=" + passengerId + ", flightId=" + flightId + ", departureDate=" + departureDate
				+ ", amountPaid=" + amountPaid + ", status=" + status + "";
	}

	
}
