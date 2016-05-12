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


//    public Teacher find(Integer id) {
//        return em.find(Teacher.class, id);
//    }
public Experience find (Integer teacher_id){
    return em.find(Experience.class, teacher_id);
}


    public List<Experience> findAll() {
        return em.createNamedQuery("Experience.findAll").getResultList();
    }

}
