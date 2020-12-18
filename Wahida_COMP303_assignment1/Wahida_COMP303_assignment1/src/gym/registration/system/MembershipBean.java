package gym.registration.system;

public class MembershipBean {
	
	private String firstName;
	private String lastName;
	private String streetAddress01;
	private String province;
	private String postalCode;
	private String phoneNumber;
	private String email;
	private String yearly;
	private String monthly;
	private String weekly;
	private String payment;
	
	
	
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
	public String getStreetAddress01() {
		return streetAddress01;
	}
	public void setStreetAddress01(String streetAddress01) {
		this.streetAddress01 = streetAddress01;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	public String getMonthly() {
		return monthly;
	}
	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}
	public String getWeekly() {
		return weekly;
	}
	public void setWeekly(String weekly) {
		this.weekly = weekly;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	///-----------------------------------END GetSet----------------
	public boolean checkYearly(String yearly) 
	{
		if (yearly.equals("1")){return true;}
		else{return false;}
	}
	
	public boolean checkMonthly(String monthly) 
	{
		if (monthly.equals("1")){return true;}
		else{return false;}
	}
	
	public boolean checkWeekly(String weekly) 
	{
		if (weekly.equals("1")){return true;}
		else{return false;}
	}
	
	public String checkPayment(String payment) 
	{
		if (payment.equals("1")){return "Visa";}
		else if(payment.equals("2")){return "Master Card";}
		else if(payment.equals("3")){return "American Express";}
		else {return "Credit Type Not Selected! ";}
	}
	
	
}
