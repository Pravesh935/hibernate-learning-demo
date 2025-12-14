package company;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

public void InsertEmployee(Employee e) {
	et.begin();
	
	em.persist(e);
	
	et.commit();
	
	System.out.println("Data Inserted");
	
}

public void UpdateEmp( int id, int sal) {
    et.begin();
    
   
    Employee e = em.find(Employee.class, id);
    
	if(e!=null) {
		e.setSal(sal);
		System.out.println("Data updated");
		
	}
	else {
		System.out.println("data not available to update");
	}
	
	
	et.commit();
	
	System.out.println("Data Inserted");
	
}

public void FindEmp(int id) {
	
	Employee e = em.find(Employee.class, id);
	System.out.println(e);
	
}

public void DeleteEmp(int id) {
	
	 Employee e = em.find(Employee.class, id);
	 if(e!=null)
	 {
		 em.remove(e);
		 System.out.println("Employee Deleted");
	 }
	 else {
         System.out.println("Employee with ID " + id + " not found.");
     }
	
}

//public void Exit() {
//	System.exit(0);
//	
//}
}
