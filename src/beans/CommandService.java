package beans;

import tables.Command;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Belogod on 27.04.2016.
 */
@Stateless
public class CommandService {
    @PersistenceContext
    EntityManager em;

    public List<Command> findAll() {
        return em.createNamedQuery("Command.findAll").getResultList();
    }
}
