package beans;

import tables.Gallery;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Belogod on 27.04.2016.
 */
@Stateless
public class GalleryService {
    @PersistenceContext
    EntityManager em;

    public List<Gallery> findAll() {
        return em.createNamedQuery("Gallery.findAll").getResultList();
    }
}
