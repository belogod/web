package tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;


@Entity
@NamedQueries({
        @NamedQuery(name = "Client.findAll", query = "select c from Client c")
})
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 25)
    private String lastName;
    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String phone;
    @Column(length = 100)
    private String email;

    @ManyToMany(mappedBy = "clients")
    private Collection<Gruppa> grupps;

    @OneToMany (mappedBy = "client")
    private Collection<Review> reviews;


    public Client(String lastName, String name, String phone, String email) {
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(name, client.name) &&
                Objects.equals(phone, client.phone) &&
                Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, name, phone, email);
    }

    public Collection<Gruppa> getGrupps() {
        return grupps;
    }

    public void setGrupps(Collection<Gruppa> grupps) {
        this.grupps = grupps;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviews) {
        this.reviews = reviews;
    }
}
