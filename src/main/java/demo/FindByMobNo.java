package demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class FindByMobNo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	
//	CustomQuery cq = new CustomQuery("Aman", 89, 9118221727L);
//	em.persist(cq);

	String jpql = "select  q from CustomQuery q where q.mobno=: mobno";
	
	CustomQuery q = (CustomQuery) em.createQuery(jpql).setParameter("mobno", 9128521727L).getSingleResult();
	
	System.out.println(q);
	
	et.commit();
}
}
