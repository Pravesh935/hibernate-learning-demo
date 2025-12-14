package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindOperation {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	 Adhar a = em.find(Adhar.class, 101);
	 System.out.println(a.getId());
	 System.out.println(a.getAddress());
	 System.out.println(a.getAdharno());
	 
	 System.out.println("-----------------------------------");
	 
	 Person p = em.find(Person.class, 201);
	 System.out.println(p.getId());
	 System.out.println(p.getName());
	 System.out.println(p.getAge());
//	 System.out.println(p.getAdhar());
	 System.out.println(p.getAdhar().getId());
	 System.out.println(p.getAdhar().getAdharno());
	 System.out.println(p.getAdhar().getAddress());
	 
	
	et.commit();
}
}
