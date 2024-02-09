package one2One;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class findAllPerson {
	public static void main(String[] args) {
		Persistence persistence = new Persistence();
		EntityManagerFactory emF = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emF.createEntityManager();
		String query = "select p from person p";
		Query createQuery = em.createQuery(query);
		List<person> resultList = createQuery.getResultList();
		for (person p : resultList) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPhone());
			System.out.println(p.getCard().getId());
			System.out.println(p.getCard().getNumber());
			System.out.println(p.getCard().getDob());
			System.out.println("_________________");
		}
	}
}
