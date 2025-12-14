package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOperation {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	 et.begin();
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the id which you want to delete : ");
	 int id = sc.nextInt();
	 
	 Student s = em.find(Student.class, id);
//	 1st we need to check the table is empty or not if table is empty we cant perform remove() method.
	 if(s!=null)
	 {
//		 remove() method is used to delete the data from the database, It will take object as an argument.
		 em.remove(s);
		 System.out.println("Student Deleted");
	 }
	 else {
         System.out.println("Student with ID " + id + " not found.");
     }
	 
	 
	 et.commit();
	 
	 sc.close();
}

}
