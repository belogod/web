package beans;

import tables.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Belogod on 11.03.2016.
 */
@Stateless
public class BookService {
    @PersistenceContext
    EntityManager em;
    public Book create(String title, String avtor, Integer pages){
        Book book = new Book(title,avtor,pages);
        em.persist(book);
        return book;
    }
    public List<Book> findAll ()  {

        return em.createNamedQuery("Book.findAll").getResultList();
    }
}
