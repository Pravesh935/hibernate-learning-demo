package one_to_many_and_many_to_one;

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
	
	
	Book b1 = new Book(101, "HaryPotter", 500, null);
	Book b2 = new Book(102, "Sudhamurthy", 600, null);
	Library lib = new Library(101, "xyz", Arrays.asList(b1, b2));
	b1.setLib(lib);
	b2.setLib(lib);
	
	
	et.begin();
	
	em.persist(b1);
	em.persist(b2);
	em.persist(lib);
	
	
	et.commit();

}
}
