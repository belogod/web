package tables;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created by Eugeny on 11.04.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Interesting.findAll", query = "select i from Interesting i"),
        @NamedQuery(name = "Interesting.findByType", query = "select i from Interesting i where i.type=:type")
})
public class Interesting {
   public final static Integer INTERESTING = 1;
   public final static Integer SLANG = 2;
   public final static Integer LAZY = 3;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String picture;
    @Lob
    private String text;
    private String url;
    private Integer type;

    public Interesting(String title, String picture, String text, String url, Integer type) {
        this.title = title;
        this.picture = picture;
        this.text = text;
        this.url = url;
        this.type = type;
    }

    public Interesting() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Interesting)) return false;
        Interesting that = (Interesting) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
