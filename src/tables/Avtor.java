package tables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Belogod on 15.03.2016.
 */
@Entity
public class Avtor {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastname;
    private String name;

@OneToMany (mappedBy = "avtor")
private Collection<Book> books;


    @OneToMany (mappedBy = "avtor")
    private Collection<Audiobook> audiobooks;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Avtor(String lastname, String name) {
        this.lastname = lastname;
        this.name = name;
    }

    public Avtor() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Avtor avtor = (Avtor) o;

        if (id != null ? !id.equals(avtor.id) : avtor.id != null) return false;
        if (lastname != null ? !lastname.equals(avtor.lastname) : avtor.lastname != null) return false;
        return name != null ? name.equals(avtor.name) : avtor.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Avtor{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Audiobook> getAudiobooks() {
        return audiobooks;
    }

    public void setAudiobooks(Collection<Audiobook> audiobooks) {
        this.audiobooks = audiobooks;
    }
}
