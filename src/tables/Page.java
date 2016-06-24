package tables;

import javax.persistence.*;
import java.util.Objects;


@Entity
@NamedQueries({
        @NamedQuery(name = "Page.find", query = "select p from Page p where p.url = :url")
})
public class Page {
    @Id
    private String url;
    private String title;
    @Lob
    private String text;

    public Page(String url, String text) {
        this.url = url;
        this.text = text;
        this.title = title;
    }

    public Page() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Page)) return false;
        Page page = (Page) o;
        return Objects.equals(url, page.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }
}
