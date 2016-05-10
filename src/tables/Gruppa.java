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
    @Column(length = 100)
    private String title;
    private Date startDate;
    @Lob
    private String text;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany
    private List<Client> clients;

    public Gruppa(String title, Date startDate, String text) {
        this.title = title;
        this.startDate = startDate;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        if (o == null || getClass() != o.getClass()) return false;

        Gruppa gruppa = (Gruppa) o;

        if (id != null ? !id.equals(gruppa.id) : gruppa.id != null) return false;
        if (title != null ? !title.equals(gruppa.title) : gruppa.title != null) return false;
        if (startDate != null ? !startDate.equals(gruppa.startDate) : gruppa.startDate != null) return false;
        if (text != null ? !text.equals(gruppa.text) : gruppa.text != null) return false;
        if (teacher != null ? !teacher.equals(gruppa.teacher) : gruppa.teacher != null) return false;
        return clients != null ? clients.equals(gruppa.clients) : gruppa.clients == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (clients != null ? clients.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gruppa{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", text='" + text + '\'' +
                ", teacher=" + teacher +
                ", clients=" + clients +
                '}';
    }
}
