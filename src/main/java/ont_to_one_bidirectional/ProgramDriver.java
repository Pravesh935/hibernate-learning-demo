package ont_to_one_bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProgramDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	
	
//	Insert Operation
	Driver d = new Driver(103, "Guddu", 26, null);
	License li = new License(203, 133334, "Truck", d);
	d.setLicense(li);
	
	em.persist(d);
	em.persist(li);
	System.out.println("Data Saved Successfully!");
	
	
//	Delete Operation
//	 Driver d1=em.find(Driver.class, 103);
//	 License l = em.find(License.class, 203);
//	 if(d1!=null && l!=null) {
//		 em.remove(d1);
//		 em.remove(l);
//		 System.out.println("Data removed Successfully!");
//	 }
	
	
	et.commit();
}
}
