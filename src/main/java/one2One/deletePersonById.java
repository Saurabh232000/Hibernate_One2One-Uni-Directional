package one2One;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class deletePersonById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persistence persistence = new Persistence();
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emF.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		System.out.println("Enter Person Id To Find:");
		int id = sc.nextInt();
		person find = em.find(person.class, id);
		if (find != null) {
			tx.begin();
			em.remove(find);
			tx.commit();
			System.out.println("One Record Deleted Successfully");
		} else {
			System.err.println(" Invalid Id:");
		}
	}
}
