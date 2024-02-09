package one2One;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findByPersonId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persistence persistence = new Persistence();
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emF.createEntityManager();
		System.out.println("Enter Person Id To Find:");
		int id = sc.nextInt();
		person find = em.find(person.class, id);
		if (find != null) {
			System.out.println(find.getId());
			System.out.println(find.getName());
			System.out.println(find.getPhone());
			System.out.println(find.getCard().getId());
			System.out.println(find.getCard().getNumber());
			System.out.println(find.getCard().getDob());
		} else {
			System.err.println(" Invalid Persin Id:");
		}
	}
}
