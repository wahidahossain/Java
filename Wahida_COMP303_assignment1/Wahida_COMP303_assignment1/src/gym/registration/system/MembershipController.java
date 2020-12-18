package gym.registration.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MembershipController {
	@RequestMapping(value = "/placeorder", method = RequestMethod.POST)  
	  
	   public ModelAndView placeorder(HttpServletRequest request,HttpServletResponse response) {
		  String firstName=request.getParameter("firstName");  
		  String lastName=request.getParameter("lastName");
		  String streetAddress01=request.getParameter("streetAddress01");
		  String province=request.getParameter("province");
		  String postalCode=request.getParameter("postalCode");
		  String phoneNumber=request.getParameter("phoneNumber");
		  String email=request.getParameter("email");		 
		  String yearly=request.getParameter("yearly");
		  String monthly=request.getParameter("monthly");
		  String weekly=request.getParameter("weekly");
		  String payment=request.getParameter("payment");
		  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	      MembershipBean membershipBean=new MembershipBean();
		  //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	    
	      membershipBean.setFirstName(firstName);
	      membershipBean.setLastName(lastName);
	      membershipBean.setStreetAddress01(streetAddress01);
	      membershipBean.setProvince(province);
	      membershipBean.setPostalCode(postalCode);
	      membershipBean.setPhoneNumber(phoneNumber);
	      membershipBean.setEmail(email);
		  
	      if (yearly == null) {membershipBean.setYearly("Yearly");}
	      else {membershipBean.setYearly("");}
	      
	      if (monthly == null) {membershipBean.setMonthly("Monthly");}
	      else {membershipBean.setMonthly("");}
	      
	      if (weekly == null) {membershipBean.setWeekly("Weekly");}
	      else {membershipBean.setWeekly("");}
		  
	      membershipBean.setPayment(membershipBean.checkPayment(payment));
	      
	      
    
	      return new ModelAndView("show_details","MembershipBean", membershipBean);

	      

	   }
}
