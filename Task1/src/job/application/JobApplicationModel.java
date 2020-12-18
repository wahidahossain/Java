package job.application;

public class JobApplicationModel {
	private String firstName;
	private String lastName;	
	private String position;
	private String email;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String checkPayment(String payment) 
	{
		if (payment.equals("1")){return "Visa";}
		else if(payment.equals("2")){return "Master Card";}
		else if(payment.equals("3")){return "American Express";}
		else {return "Credit Type Not Selected! ";}
	}
}
