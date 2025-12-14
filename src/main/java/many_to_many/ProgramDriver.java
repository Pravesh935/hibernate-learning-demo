package many_to_many;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one.College;

public class ProgramDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	
	Doctor d1 = new Doctor(101,"Allen", "Cardio", null);
	Doctor d2 = new Doctor(102,"Smith","nuero", null);
	Doctor d3 = new Doctor(103, "John", "Orthopedic", null);
	
	Patient p1 = new Patient(201,"Rohan", "Cough", Arrays.asList(d1,d2));
	Patient p2 = new Patient(202,"Sohan", "Fever", Arrays.asList(d2,d3));
	Patient p3 = new Patient(203,"Rohit", "Maleriya", Arrays.asList(d1,d3));
	
	d1.setPlist(Arrays.asList(p1,p2));
	d2.setPlist(Arrays.asList(p2,p1));
	d3.setPlist(Arrays.asList(p3,p1));
	
	
	
	et.begin();
	
//	em.persist(d1);
//	em.persist(d2);
//	em.persist(d3);
//	em.persist(p1);
//	em.persist(p2);
//	em.persist(p3);
	
	Doctor d = em.find(Doctor.class, 101);
	if(d!=null) {
		System.out.println(d);
	}
	else {
		System.out.println("College is not Present in your Databse ");
	}
	
	Patient p = em.find(Patient.class, 201);
	if(p!=null) {
		System.out.println(p);
	}
	else {
		System.out.println("College is not Present in your Databse ");
	}
	
	
	et.commit();
}
}
