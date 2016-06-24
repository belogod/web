package tables;

import javax.persistence.*;

/**
 * Created by Belogod on 24.06.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "NameCourse.findAll", query = "select n from NameCourse n")
})
public class NameCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToOne(optional = false)
       private Сourse сourse;


    public NameCourse(String title) {
        this.title = title;
    }

    public NameCourse() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameCourse that = (NameCourse) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return title != null ? title.equals(that.title) : that.title == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NameCourse{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }



    public Сourse getСourse() {
        return сourse;
    }

    public void setСourse(Сourse сourse) {
        this.сourse = сourse;
    }
}
