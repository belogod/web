package beans;

import tables.Сourse;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Belogod on 24.06.2016.
 */
@Stateless
public class CourseService {
    @PersistenceContext
    EntityManager em;


    public List <Сourse> findAll(){
        return em.createNamedQuery("Course.findAll").getResultList();
    }
}
