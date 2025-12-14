package Task2;

import java.util.Arrays;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ProgramDriver {
	
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
		
//		em.persist(m1);
//		em.persist(m2);
//		em.persist(m3);
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movies ID: ");
		int id = sc.nextInt();
		Movies m = em.find(Movies.class, id);
		if(m!=null) {
			System.out.println(m.getMname());
		}
		else {
			System.out.println("Movie is not available! ");
		}

		System.out.println("==========================================");
		
		System.out.println("Enter the Actor ID: ");
		int aid = sc.nextInt();
		Actor a = em.find(Actor.class, aid);
		if(a!=null) {
			System.out.println(a);
		}
		else {
			System.out.println("Actor does not belongs to this movie!");
		}
		
		
		et.commit();
		
		
		sc.close();
	}
	

}
