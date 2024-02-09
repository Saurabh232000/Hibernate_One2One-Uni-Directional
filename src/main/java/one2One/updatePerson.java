package one2One;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updatePerson {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person  Id To Update");
		int id = sc.nextInt();
		person p = new person();
		p.setId(id);
		p.setName("JKL");
		p.setPhone(67657447);
		pancard card = new pancard();
		card.setNumber("DNPA6676P");
		card.setDob(LocalDate.parse("1992-07-20"));
		p.setCard(card);
		manager.merge(p);
		tx.begin();
		tx.commit();
	}
}
