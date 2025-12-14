package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		 
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Mark");
			int mark = sc.nextInt();
			
			Student s = new Student(name, mark);
			
//			persist() method is used to insert the data into the database. It will take object as an argument or
//			Save a new record use persist() method it will take argument of Student ref.variable
			em.persist(s);
			System.out.println("Student Inserted");
			
			et.commit();
	
		sc.close();
	}
	 
	 
}
