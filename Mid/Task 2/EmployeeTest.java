package com.jpa;
/*
 * COMP 303 Java EE
 * JPA - Java Persistence API example
 * 30-Jan-2020
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeTest {	
	//defining a factory object from EntityManagerFactory
	private static EntityManagerFactory factory;	
	public static void main(String[] args) {
    //exception handling		
	try {	
		//factory object initialized using JPA persistent unit name
		factory = Persistence.createEntityManagerFactory("EmployeeJPA");
		
		//creating entity manager (em) object using factory object
		EntityManager em = factory.createEntityManager();
		
		//query object to pass JPA query to fetch data from employee table
		Query query = em.createQuery("select e from Employee e where jobTitle='Manager'");
		
		//store the table details in a list object
	    List<Employee> employeeList = query.getResultList();
	    
	    //print the list object
		for (Employee employee : employeeList) {
		      System.out.println(employee);
		    }      
		}
		catch(Exception e)
		{
	        System.out.println(e.getMessage());
		}
	}
}
