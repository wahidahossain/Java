package com.example.wahida;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Flight {

	private String flightId;
	private String airlineName;
	private String departAirport;
	private String arrivalAirport;
	
	@JsonFormat(pattern="HH:mm")
	private Date departTime;
	@JsonFormat(pattern="HH:mm")
	private Date arrivalTime;
	private String duration;
	private int totalSeats;
	private double price;
	

	public Flight(String flightId, String airlineName, String departAirport, 
			String arrivalAirport, 
			Date departTime,
			Date arrivalTime, 
			int totalSeats,
			double price) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.departAirport = departAirport;
		this.arrivalAirport = arrivalAirport;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.totalSeats = totalSeats;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Flight() {
		super();
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightId() {
		return flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getDepartAirport() {
		return departAirport;
	}
	public void setDepartAirport(String departAirport) {
		this.departAirport = departAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public Date getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Date departTime) {
		this.departTime = departTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		long diff = arrivalTime.getTime() - departTime.getTime();

		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		
		duration = diffHours + "h " + diffMinutes + "m";
		return duration;
	}

	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departTime == null) ? 0 : departTime.hashCode());
		result = prime * result + ((flightId == null) ? 0 : flightId.hashCode());
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
		Flight other = (Flight) obj;
		if (departTime == null) {
			if (other.departTime != null)
				return false;
		} else if (!departTime.equals(other.departTime))
			return false;
		if (flightId == null) {
			if (other.flightId != null)
				return false;
		} else if (!flightId.equals(other.flightId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Flight: flightId=" + flightId + ", airlineName=" + airlineName + ", departAirport=" + departAirport
				+ ", arrivalAirport=" + arrivalAirport + ", departTime=" + departTime + ", arrivalTime=" + arrivalTime
				+ ", duration=" + duration + ", totalSeats=" + totalSeats + "";
	}

}
