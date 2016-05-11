package tables;

import javax.persistence.*;
import java.util.Objects;


@Entity
@NamedQueries({
        @NamedQuery(name = "Training.findAll", query = "select i from Training i"),
        @NamedQuery(name = "Training.findByType", query = "select i from Training i where i.type=:type")
})
public class Training {
    public final static Integer INTERESTING = 1;
    public final static Integer SLANG = 2;
    public final static Integer LAZY = 3;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String title;
    @Column(length = 50)
    private String picture;
    @Lob
    private String text;
    @Column(length = 100)
    private String url;
    private Integer type;

    public Training(String title, String picture, String text, String url, Integer type) {
        this.title = title;
        this.picture = picture;
        this.text = text;
        this.url = url;
        this.type = type;
    }

    public Training() {
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
        if (!(o instanceof Training)) return false;
        Training that = (Training) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}