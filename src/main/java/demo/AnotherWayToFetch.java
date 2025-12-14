package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import company.Employee;

public class AnotherWayToFetch {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	
	String query = " SELECT e from Employee e WHERE e.name = :na ";
	
    Employee foundEmp	=  (Employee) em.createQuery(query).setParameter("na", "Allen").getSingleResult();
    
    System.out.println(foundEmp);
	
	
	
	et.commit();
}
}
