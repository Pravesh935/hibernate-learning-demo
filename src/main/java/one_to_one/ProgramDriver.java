package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProgramDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		
		Adhar adhar = new Adhar(105, 776330878780L, "Dilsukh Nagar");
		Person person = new Person(205, "Charan", 23, adhar);
		
		
		et.begin();
		
		em.persist(adhar);
		em.persist(person);
		
		et.commit();
	}
	
	
	
}
