package tables;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by Yevhen on 29.02.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Teacher.findAll", query = "select t from Teacher t")
})
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String lastName;
    @Column(length = 15)
    private String name;
    @Column(length = 20)
    private String phone;
    @Column(length = 100)
    private String email;
    @Column(length = 25)
    private String pictureFileName;
    @Column(length = 3)
    private int age;

    @OneToMany(mappedBy = "teacher")
    private Collection<Gruppa> grupps;



    @OneToMany(mappedBy = "teacher")
    private Collection<Review> reviews;

    @OneToMany (mappedBy = "teacher")
    private Collection<Command> commands;


    public Teacher(String lastName, String name, String phone, String email, String pictureFileName, int age, Collection<Gruppa> grupps, Collection<Review> reviews, Collection<Command> commands) {
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.pictureFileName = pictureFileName;
        this.age = age;
        this.grupps = grupps;
        this.reviews = reviews;
        this.commands = commands;
    }

    public Teacher(String lastName, String name, String phone, String email, String pictureFileName, String age) {
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

    public String getPictureFileName() {
        return pictureFileName;
    }

    public void setPictureFileName(String pictureFileName) {
        this.pictureFileName = pictureFileName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pictureFileName='" + pictureFileName + '\'' +
                ", grupps=" + grupps +
                ", reviews=" + reviews +
                ", commands=" + commands +
                ", age=" + age +
                '}';
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

    public Collection<Command> getCommands() {
        return commands;
    }

    public void setCommands(Collection<Command> commands) {
        this.commands = commands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
