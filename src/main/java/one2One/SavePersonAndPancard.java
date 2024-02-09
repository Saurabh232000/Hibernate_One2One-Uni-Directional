
package one2One;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndPancard {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		pancard card = new pancard();
		card.setNumber("AZBH85E3N");
		card.setDob(LocalDate.parse("2000-08-20"));
		person p = new person();
		p.setName("GHI");
		p.setPhone(1226724);
		p.setCard(card);
		manager.persist(p);
		// manager.persist(card);
		tx.begin();
		tx.commit();
	}
}
