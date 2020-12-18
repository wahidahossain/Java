package job.application;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import job.application.JobApplicationModel;

@Controller
public class JobApplicationController {
	@RequestMapping(value = "/placeorder", method = RequestMethod.POST)  
	  
	   public ModelAndView placeorder(HttpServletRequest request,HttpServletResponse response) {		
		
		
		  String firstName=request.getParameter("firstName");  
		  String lastName=request.getParameter("lastName");
		  String position=request.getParameter("position");
		  String email=request.getParameter("email");
		  String payment=request.getParameter("payment");
		  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		  JobApplicationModel jobApplicationModel=new JobApplicationModel();
		  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    
		  jobApplicationModel.setFirstName(firstName);
		  jobApplicationModel.setLastName(lastName);
		  jobApplicationModel.setPosition(position);
		  jobApplicationModel.setEmail(email); 
	    
		  
		  jobApplicationModel.setPayment(jobApplicationModel.checkPayment(payment));    
 
	      return new ModelAndView("thankYouView","JobApplicationModel", jobApplicationModel);

	      

	   }
}
