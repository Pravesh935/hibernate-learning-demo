package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOperation {
 public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		 et.begin();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the ID where you want to Update: ");
		 int id = sc.nextInt();
		 
//		 em.find(Class, id) this method is used to Retrieve a record from DB it will return object
		  Student s = em.find(Student.class, id);
		  if(s!=null)
			 {
				 s.setMark(85);
				 
//			     merge(Object) → update existing objects	 
				 em.merge(s);
				 System.out.println("Student Mark Updated");
			 } 
			 
			 else {
	             System.out.println("Student with ID " + id + " not found.");
	         }
		 
		 
		 
		 et.commit();
		 
		 sc.close();
}
}
