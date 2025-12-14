package one_to_one;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person ID: ");
		int id = sc.nextInt();
		Person p = em.find(Person.class, id);
		
		if(p!=null) {
			
			em.remove(p);
			System.out.println("Person Deleted!");
		}
		
		
		
		et.commit();
		
		
		sc.close();
	}
}
