package tables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Belogod on 24.06.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "NameCourse.findAll", query = "select n from Title n")
})
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String price;
    private String text;

  @OneToMany (mappedBy = "title")
  private Collection <Сourse> courses;


    public Title(String title, String price, String text, Collection<Сourse> courses) {
        this.title = title;
        this.price = price;
        this.text = text;
        this.courses = courses;
    }

    public Title() {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Collection<Сourse> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Сourse> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Title title1 = (Title) o;

        if (id != null ? !id.equals(title1.id) : title1.id != null) return false;
        if (title != null ? !title.equals(title1.title) : title1.title != null) return false;
        if (price != null ? !price.equals(title1.price) : title1.price != null) return false;
        if (text != null ? !text.equals(title1.text) : title1.text != null) return false;
        return courses != null ? courses.equals(title1.courses) : title1.courses == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (courses != null ? courses.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", text='" + text + '\'' +
                ", courses=" + courses +
                '}';
    }
}
