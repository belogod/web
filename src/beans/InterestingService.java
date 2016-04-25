package beans;

import tables.Client;
import tables.Interesting;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Eugeny on 11.04.2016.
 */
@Stateless
public class InterestingService {
    @PersistenceContext
    EntityManager em;

    public List<Interesting> findAll() {
        return em.createNamedQuery("Interesting.findAll").getResultList();
    }

    public List<Interesting> findByType(int type) {
        return em.createNamedQuery("Interesting.findByType").setParameter("type", type).getResultList();
    }
}
