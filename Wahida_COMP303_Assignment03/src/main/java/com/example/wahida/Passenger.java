package com.example.wahida;


public class Passenger {

	private String passengerId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String telephone;
	private String email;
	

	public Passenger(
			String firstName, 
			String lastName, 
			String address, 
			String city, 
			String country,
			String telephone, 
			String email) {
		super();
		this.passengerId = new IdGenerator().getPassengerId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Passenger() {
		super();
		this.passengerId = new IdGenerator().getPassengerId();
	}

	public String getPassengerId() {
		return passengerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passengerId == null) ? 0 : passengerId.hashCode());
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
		Passenger other = (Passenger) obj;
		if (passengerId == null) {
			if (other.passengerId != null)
				return false;
		} else if (!passengerId.equals(other.passengerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passenger: passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", country=" + country + ", telephone=" + telephone
				+ ", email=" + email + "";
	}
	
}
