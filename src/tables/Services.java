package tables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Belogod on 11.03.2016.
 */
@Entity
public class Services {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String language;
    private String price;




    @OneToMany (mappedBy = "services")
    private Collection<Teacher> teacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Services(String language, String price) {
        this.language = language;
        this.price = price;
    }

    public Services() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Services services = (Services) o;

        if (id != null ? !id.equals(services.id) : services.id != null) return false;
        if (language != null ? !language.equals(services.language) : services.language != null) return false;
        return price != null ? price.equals(services.price) : services.price == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", price='" + price + '\'' +
                '}';
    }



}
