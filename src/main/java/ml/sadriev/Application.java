package ml.sadriev;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import ml.sadriev.model.Unit;

public class Application {

    public static void main(String[] args) {
        final EntityManager em = Persistence.createEntityManagerFactory("ml.sadriev.hibernate").createEntityManager();

        /*final Unit unit = new Unit();
        unit.setActive(false);
        unit.setName("First unit");

        em.getTransaction().begin();

        em.persist(unit);
        em.getTransaction().commit();*/

        System.out.println(em.find(Unit.class, 3L));

        em.close();
    }
}
