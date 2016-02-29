package beans;

import tables.Client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Yevhen on 29.02.2016.
 */
@Stateless
public class ClientService {
    @PersistenceContext
    EntityManager em;

    public Client create(String lastName, String name, String phone, String email) {
        Client client = new Client(lastName,name,phone,email);
        em.persist(client);
        return client;
    }

    public List<Client> findAll() {
        return em.createNamedQuery("Client.findAll").getResultList();
    }
}
