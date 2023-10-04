package database.dao;

import database.modelo.Reserva;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class ReservasDao {
    private EntityManager em;
    public ReservasDao (EntityManager em) {
        this.em = em;
    }

    public void guardar(Reserva reserva) {
        this.em.persist(reserva);
    }


}
