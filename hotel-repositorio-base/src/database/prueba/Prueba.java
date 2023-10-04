package database.prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prueba {
    public static void main(String[] args) {
        EntityManagerFactory em = Persistence.createEntityManagerFactory("sistema_de_reservas");
        em.createEntityManager();

    }
}
