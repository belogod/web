package beans;

import tables.Teacher;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Eugeny on 22.03.2016.
 */
@Stateless
public class TeacherService {
    @PersistenceContext
    EntityManager em;

    public Teacher create(String lastName, String name, String phone, String pictureFileName) {
        Teacher teacher = new Teacher(lastName,name,phone,pictureFileName);
        em.persist(teacher);
        return teacher;
    }

    public List<Teacher> findAll() {
        return em.createNamedQuery("Teacher.findAll").getResultList();
    }
}
