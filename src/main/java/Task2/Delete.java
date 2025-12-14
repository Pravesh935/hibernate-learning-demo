package Task2;

import java.util.Arrays;
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
	
	Movies m1 = new Movies(101,"Bahubali", 350.00, null);
	Movies m2 = new Movies(102,"OG", 450.00, null);
	Movies m3 = new Movies(103,"Hit The 3rd Case", 250.00, null);
	
	Actor a1 = new Actor(201, "Prabhas", 40, Arrays.asList(m1));
	Actor a2 = new Actor(202, "Pawan Kalyan", 42, Arrays.asList(m1,m3));
	Actor a3 = new Actor(203, "Nani", 38, Arrays.asList(m2,m1));
	
	m1.setAlist(Arrays.asList(a1,a2));
	m2.setAlist(Arrays.asList(a2,a3));
	m3.setAlist(Arrays.asList(a1));
	
	et.begin();
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the movies ID: ");
	int id = sc.nextInt();
	Movies m = em.find(Movies.class, id);
	
	if(m!=null) {
		em.remove(m3);
		System.out.println("Removed Successfully!");
	}
	
	
	
	et.commit();
	
	
	sc.close();
}
}
