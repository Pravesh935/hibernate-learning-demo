package demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import company.Employee;

public class CustomWayToFetchAllDetails {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	
	String query = "SELECT e from Employee e";
	
	List<Employee> elist = em.createQuery(query).getResultList();
	System.out.println(elist);
	
	
	
	
	et.commit();
}
}
