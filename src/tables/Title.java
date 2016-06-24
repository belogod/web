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

  @OneToMany (mappedBy = "title")
  private Collection <Сourse> courses;


    public Title(String title, Collection<Сourse> courses) {
        this.title = title;
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

        Title that = (Title) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return courses != null ? courses.equals(that.courses) : that.courses == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (courses != null ? courses.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", courses=" + courses +
                '}';
    }
}
