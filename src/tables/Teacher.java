package tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by Yevhen on 29.02.2016.
 */
@Entity
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private String name;
    private String phone;

    @OneToMany(mappedBy = "teacher")
    private Collection<Gruppa> grupps;

    @ManyToOne(optional = false)
    private Services services;



    public Teacher(String lastName, String name, String phone) {
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
    }

    public Teacher() {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) &&
                Objects.equals(lastName, teacher.lastName) &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(phone, teacher.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, name, phone);
    }

    public Collection<Gruppa> getGrupps() {
        return grupps;
    }

    public void setGrupps(Collection<Gruppa> grupps) {
        this.grupps = grupps;
    }



    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
