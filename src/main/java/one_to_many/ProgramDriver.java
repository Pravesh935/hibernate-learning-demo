package one_to_many;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProgramDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Worker w1 = new Worker(103, "Sohit", 8000);
	Worker w2 = new Worker(104, "Sohan", 9000);
	
	Company c = new Company(202, "Infosys", Arrays.asList(w1, w2));
	
	et.begin();
	em.persist(w1);
	em.persist(w2);
	em.persist(c);
	
	et.commit();
}
}
