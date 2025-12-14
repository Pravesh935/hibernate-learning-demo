package Task;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO {

	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
// SaveDetails
 public void saveDetails(int id, String model, int sid, String provider, long mob) {
	 Mobile m = new Mobile();
	 Simcard s = new Simcard();
	 
	 m.setId(id);
	 m.setModel(model);
	 m.setSim(s);
	 s.setId(sid);
	 s.setProvider(provider);
	 s.setNumber(mob);
	 s.setMob(m);
	 
	et.begin();
	em.persist(m);
	em.persist(s);
	
	et.commit();
	
	
 }
 public void find(int id) {
	Mobile m1 = em.find(Mobile.class, id);
	
	if(m1!=null) {
		System.out.println(m1);
		Simcard s1 = m1.getSim();
		System.out.println(s1);
	}
	else {
		System.out.println("Data not available");
	}
	
 }
 public void update(int id) {
	 et.begin();
	Mobile m2 = em.find(Mobile.class, id);
	if(m2!=null) {
	Simcard s=	 em.find(Simcard.class, 1234); 
	 if(s!=null) {
		 System.out.println("found");
		 m2.setSim(s);
		 em.merge(m2);
	 }
		
		
		
	}
	et.commit();
	
 }
 
}
