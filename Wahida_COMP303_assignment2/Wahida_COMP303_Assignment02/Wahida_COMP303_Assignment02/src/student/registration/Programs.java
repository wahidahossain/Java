package student.registration;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Programs
 *
 */
@Entity

public class Programs implements Serializable {
	
	@Id
	private int programCode;
	private String programName;
	private int duration;
	private Double fee;
	private static final long serialVersionUID = 1L;

	public Programs() {
		super();
	}

	public int getProgramCode() {
		return programCode;
	}

	public void setProgramCode(int programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Programs [programCode=" + programCode + ", programName=" + programName + ", duration=" + duration
				+ ", fee=" + fee + "]";
	}
   
}
