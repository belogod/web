package tables;

import javax.persistence.*;

/**
 * Created by Belogod on 11.03.2016.
 */
@Entity
public class Audiobook {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer time;


    @ManyToOne(optional = false)
    private Avtor avtor;




    public Audiobook(String title, Integer time) {
        this.title = title;
        this.time = time;
    }

    public Audiobook() {
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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audiobook audiobook = (Audiobook) o;

        if (id != null ? !id.equals(audiobook.id) : audiobook.id != null) return false;
        if (title != null ? !title.equals(audiobook.title) : audiobook.title != null) return false;
        return time != null ? time.equals(audiobook.time) : audiobook.time == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Audiobook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time=" + time +
                '}';
    }



    public Avtor getAvtor() {
        return avtor;
    }

    public void setAvtor(Avtor avtor) {
        this.avtor = avtor;
    }
}
