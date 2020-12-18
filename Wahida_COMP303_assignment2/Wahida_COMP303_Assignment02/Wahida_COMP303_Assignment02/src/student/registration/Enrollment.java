package student.registration;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enrollment
 *
 */
@Entity

public class Enrollment implements Serializable {

	   
	@Id
	private int applicationNo;
	private int studentId;
	private int programCode;
	private Date startDate;
	private double amountPaid;
	private boolean stats;
	private static final long serialVersionUID = 1L;

	public Enrollment() {
		super();
	}   
	public int getApplicationNo() {
		return this.applicationNo;
	}

	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}   
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}   
	public int getProgramCode() {
		return this.programCode;
	}

	public void setProgramCode(int programCode) {
		this.programCode = programCode;
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public double getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}   
	public boolean getStatus() {
		return this.stats;
	}

	public void setStatus(boolean status) {
		this.stats = status;
	}
	
	@Override
	public String toString() {
		return "Enrollment [applicationNo=" + applicationNo + ", studentId=" + studentId + ", programCode="
				+ programCode + ", startDate=" + startDate + ", amountPaid=" + amountPaid + ", status=" + stats + "]";
	}
	
}
