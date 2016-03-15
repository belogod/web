package tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Belogod on 15.03.2016.
 */
@Entity
public class Reviews {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private String text;



    @ManyToOne(optional = false)
    private Client client;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Reviews(Date date, String text) {
        this.date = date;
        this.text = text;
    }

    public Reviews() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reviews reviews = (Reviews) o;

        if (id != null ? !id.equals(reviews.id) : reviews.id != null) return false;
        if (date != null ? !date.equals(reviews.date) : reviews.date != null) return false;
        return text != null ? text.equals(reviews.text) : reviews.text == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
