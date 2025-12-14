package many_to_one;
//In many to one two tables are required

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProgramDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	College c = new College(101, "GECB");
//	Trainer t = new Trainer(201, "Ravi Sir", "Compiler Design", c);
//	Trainer t1 = new Trainer(202, "Rupali Maam", "DBMS", c);
	
	et.begin();
	
//	em.persist(c);
//	em.persist(t);
//	em.persist(t1);
	
	
	// Find Operation
	College col = em.find(College.class, 102);
	if(col!=null) {
		System.out.println(col);
	}
	else {
		System.out.println("College is not Present in your Databse ");
	}
	
	Trainer output = em.find(Trainer.class, 201);
	if(output!=null) {
		System.out.println("Subject name : "+output.getSubject());
		System.out.println("College name : "+output.getCollege());
	}
	
	
	
	et.commit();
}
}
