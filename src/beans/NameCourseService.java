package beans;


import tables.NameCourse;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class NameCourseService {
    @PersistenceContext
    EntityManager em;

    public NameCourse find (Integer id){
        return em.find(NameCourse.class, id);
    }

    public List <NameCourse> findAll() {
        return em.createNamedQuery("NameCourse.findAll").getResultList();
    }
}
