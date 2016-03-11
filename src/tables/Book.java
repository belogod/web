package tables;

import javax.persistence.*;

/**
 * Created by Belogod on 11.03.2016.
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "select c from Book c")})
public class Book {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String avtor;
    private Integer pages;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book(String title, String avtor, Integer pages) {
        this.title = title;
        this.avtor = avtor;
        this.pages = pages;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != null ? !id.equals(book.id) : book.id != null) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (avtor != null ? !avtor.equals(book.avtor) : book.avtor != null) return false;
        return pages != null ? pages.equals(book.pages) : book.pages == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        result = 31 * result + (pages != null ? pages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", avtor='" + avtor + '\'' +
                ", pages=" + pages +
                '}';
    }
}
