package beans;

import tables.Experience;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ExperienceService {
    @PersistenceContext
    EntityManager em;


    public List<Experience> findAll() {
        return em.createNamedQuery("Experience.findAll").getResultList();
    }

}
