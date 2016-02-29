package tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by Yevhen on 29.02.2016.
 */
@Entity
public class Gruppa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Date startDate;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany
    private List<Client> clients;

    public Gruppa(String title, Date startDate) {
        this.title = title;
        this.startDate = startDate;
    }

    public Gruppa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gruppa)) return false;
        Gruppa gruppa = (Gruppa) o;
        return Objects.equals(id, gruppa.id) &&
                Objects.equals(title, gruppa.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "Gruppa{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
