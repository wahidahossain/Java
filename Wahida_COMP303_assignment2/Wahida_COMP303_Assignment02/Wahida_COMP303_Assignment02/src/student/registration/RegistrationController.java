package student.registration;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class RegistrationController 
{
	Students loggedinStudent;
	int programSelected;
	
	
	//private static EntityManagerFactory factory;
	private static EntityManagerFactory factory= Persistence.createEntityManagerFactory("Wahida_COMP303_Assignment02");
	
	@RequestMapping("/registerStudent") 
	public ModelAndView registerStudent(HttpServletRequest request,HttpServletResponse response) 
	{
		  String userName=request.getParameter("userName");
		  String password=request.getParameter("password");
		  String firstname=request.getParameter("firstname");		  
		  String lastname=request.getParameter("lastname");
		  String address=request.getParameter("address");
		  String city=request.getParameter("city");
		  String postalCode=request.getParameter("postalCode");

		  //Creating instance of a pizzaBean >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	      Students student=new Students();
		  //Populating new pizza bean >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	      student.setUserName(userName);
	      student.setPassword(password);
	      student.setFirstname(firstname);
	      student.setLastname(lastname);
	      student.setAddress(address);
	      student.setCity(city);
	      student.setPostalCode(postalCode);
	      
	      
	      //writeToStudentsTable(student);
	      
	      boolean userNameUsed=false;
	      List<Students> studentList=readFromStudentsTable("SELECT e FROM Students e");
	      
	      for (Students std : studentList) 
		    {
		    	if(std.getUserName().equals(userName))
		    	{
		    		userNameUsed=true;
		    		break;
		    	}
		    }
	      
	      if(!userNameUsed) 
	      {
		      writeToStudentsTable(student);
		      return new ModelAndView("registration_status","Students", student);
	      }
	      else
	      {
	    	  return new ModelAndView("register_again","Students", student);
	      }
	}
	
	@RequestMapping("/edit") 
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) 
	{
		  String password=request.getParameter("password");
		  String firstname=request.getParameter("firstname");		  
		  String lastname=request.getParameter("lastname");
		  String address=request.getParameter("address");
		  String city=request.getParameter("city");
		  String postalCode=request.getParameter("postalCode");

		  EntityManager em = factory.createEntityManager();
		    em.getTransaction().begin();
		    Students student = em.find(Students.class, loggedinStudent.getStudentId());

		    student.setPassword(password);
		    student.setFirstname(firstname);
		    student.setLastname(lastname);
		    student.setAddress(address);
		    student.setCity(city);
		    student.setPostalCode(postalCode);
		    em.persist(student);
		    em.getTransaction().commit();
		    em.close();
		    loggedinStudent = student;
	      return new ModelAndView("payment","Students", loggedinStudent);
	     
	}
	
	
	@RequestMapping("/loginStudent") 
	public ModelAndView loginStudent(HttpServletRequest request,HttpServletResponse response) 
	{
		  String userName=request.getParameter("loginName");
		  String password=request.getParameter("loginPassword");

		  
		  System.out.println(userName);
		  System.out.println(password);
		  
	      boolean userNameNotFound=true;
	      boolean wrongPassword=true;
	      
		  //Creating instance of a pizzaBean >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	      Students student=new Students();
	      
	      List<Students> studentList=readFromStudentsTable("SELECT e FROM Students e Where e.userName='" + userName + "' AND e.password='" + password + "'");

	      
		if(studentList.size() > 0)
		{
			loggedinStudent=studentList.get(0);
			return new ModelAndView("add_programs","Students", loggedinStudent);
		}
		else
		{
			return new ModelAndView("login_Error","message", "Iconrrect username or password");
		}
	}
	
	
	@RequestMapping("/addProgram") 
	public ModelAndView addProgram(HttpServletRequest request,HttpServletResponse response) 
	{
			programSelected=Integer.parseInt(request.getParameter("programName"));
			
			return new ModelAndView("payment","Students", loggedinStudent);
	}
	
	@RequestMapping("/edit_Info") 
	public ModelAndView edit_Info(HttpServletRequest request,HttpServletResponse response) 
	{
			
			return new ModelAndView("edit_Info","Students", loggedinStudent);
	}
	
	
	@RequestMapping("/payForTheCourse") 
	public ModelAndView payForTheCourse(HttpServletRequest request,HttpServletResponse response) 
	{
		double amountPaid=Double.parseDouble(request.getParameter("payAmount"));
		
		Enrollment enrollment=new  Enrollment();
		enrollment.setStudentId(loggedinStudent.getStudentId());
		enrollment.setProgramCode(programSelected);
		enrollment.setAmountPaid(amountPaid);
		enrollment.setStatus(true);
		
		writeToEnrollmentTable(enrollment);
		
		EntityManager em = factory.createEntityManager();
	    em.getTransaction().begin();
	    Programs program = em.find(Programs.class, programSelected);
	    em.close();
	    ModelAndView view = new ModelAndView("show_details");
	    view.addObject("Enrollement", enrollment);
	    view.addObject("Students", loggedinStudent);
	    view.addObject("Programs", program);
		return view;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void writeToEnrollmentTable(Enrollment enrollment)
	{
		EntityManager em = factory.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(enrollment);
	    em.close();
	    em.getTransaction().commit();
	}
	
	private static void writeToStudentsTable(Students student)
	{
		EntityManager em = factory.createEntityManager();
	    em.getTransaction().begin();
	    em.persist(student);
	    em.close();
	    em.getTransaction().commit();
	}
	
	public boolean isRecordExist(String queryString) 
	{	
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery(queryString);
	    em.getTransaction().begin();
	    Long count = (Long) query.getSingleResult();
	    em.close();
	    return ( ( count.equals( 0L ) ) ? false : true );
	}
	
	
	private static List<Students> readFromStudentsTable(String queryString)
	{		
		EntityManager em = factory.createEntityManager();
	    em.getTransaction().begin();
		Query query = em.createQuery(queryString);
		List<Students> studentList = query.getResultList();
	    em.close();
	    return studentList;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
