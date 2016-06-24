package beans;

import tables.Page;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PageService {
    @PersistenceContext
    EntityManager em;

    public Page find(String url) {
        return em.find(Page.class, url);
    }
}
