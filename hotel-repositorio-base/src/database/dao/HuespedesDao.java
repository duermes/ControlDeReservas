package database.dao;

import javax.persistence.EntityManager;

public class HuespedesDao {
    private EntityManager em;

    public HuespedesDao (EntityManager em) {
        this.em = em;
    }

}
