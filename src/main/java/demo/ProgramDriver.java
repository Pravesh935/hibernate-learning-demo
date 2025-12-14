package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// Note: “First I create the factory, then the manager, then I begin a transaction, then I persist or update or find... finally I commit.”

public class ProgramDriver {

	public static void main(String[] args) {

//		EntityManagerFactory is responsible Load the Driver and Established Connection.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");

//		EntityManager is responsible to perform all the CRUD operation.
		EntityManager em = emf.createEntityManager();

//		EntityTransaction is responsible for managing the database transaction —
//		It is a controller that handles beginning and ending a group of database actions safely.
		EntityTransaction et = em.getTransaction();

//		begin() method is used to Starts a new transaction
		et.begin();

		// Note : In between begin() and commit() method we perform all the CRUD
		// Operation like Insert, Delete and Update.

//		 commit() method is used to Commits the transaction to DB permanently
		et.commit();
	}
}
