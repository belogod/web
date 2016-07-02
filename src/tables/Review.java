package tables;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private String text;
    private String title;

    @ManyToOne(optional = false)
    private Client client;

    @ManyToOne(optional = false)
    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Review(Date date, String text, String title) {
        this.date = date;
        this.text = text;
        this.title = title;
    }

    public Review() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (id != null ? !id.equals(review.id) : review.id != null) return false;
        if (date != null ? !date.equals(review.date) : review.date != null) return false;
        if (text != null ? !text.equals(review.text) : review.text != null) return false;
        if (title != null ? !title.equals(review.title) : review.title != null) return false;
        if (client != null ? !client.equals(review.client) : review.client != null) return false;
        return teacher != null ? teacher.equals(review.teacher) : review.teacher == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", date=" + date +
                ", text='" + text + '\'' +
                ", title='" + title + '\''+
                '}';
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
