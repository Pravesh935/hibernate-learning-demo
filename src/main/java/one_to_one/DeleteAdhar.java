package one_to_one;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class DeleteAdhar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		Person p = em.find(Person.class, 204);
		
		if(p!=null) {
			
			p.setAdhar(null);
			em.merge(p);
			
			Adhar a = em.find(Adhar.class, 104);
			
			em.remove(a);
			System.out.println("Adhar Deleted!");
		}
		
		
		
		et.commit();
		
		
		
	}
}
