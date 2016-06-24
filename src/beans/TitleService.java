package beans;


import tables.Title;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TitleService {
    @PersistenceContext
    EntityManager em;

    public Title find (Integer id){
        return em.find(Title.class, id);
    }

    public List <Title> findAll() {
        return em.createNamedQuery("NameCourse.findAll").getResultList();
    }
}
