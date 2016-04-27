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
    private String lastName;
    private String name;
    private String phone;
    private String email;
    private String diploma;
    private String experience;
    private String pictureFileName;

    @OneToMany(mappedBy = "teacher")
    private Collection<Gruppa> grupps;



    @OneToMany(mappedBy = "teacher")
    private Collection<Review> reviews;

    @OneToMany (mappedBy = "teacher")
    private Collection<Command> commands;


    public Teacher(String lastName, String name, String phone, String email, String diploma, String experience, String pictureFileName, Collection<Gruppa> grupps, Collection<Review> reviews, Collection<Command> commands) {
        this.lastName = lastName;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.diploma = diploma;
        this.experience = experience;
        this.pictureFileName = pictureFileName;
        this.grupps = grupps;
        this.reviews = reviews;
        this.commands = commands;
    }

    public Teacher(String lastName, String name, String phone, String email, String diploma, String experience, String pictureFileName) {
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

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", diploma='" + diploma + '\'' +
                ", experience='" + experience + '\'' +
                ", pictureFileName='" + pictureFileName + '\'' +
                ", grupps=" + grupps +
                ", reviews=" + reviews +
                ", commands=" + commands +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != null ? !id.equals(teacher.id) : teacher.id != null) return false;
        if (lastName != null ? !lastName.equals(teacher.lastName) : teacher.lastName != null) return false;
        if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
        if (phone != null ? !phone.equals(teacher.phone) : teacher.phone != null) return false;
        if (email != null ? !email.equals(teacher.email) : teacher.email != null) return false;
        if (diploma != null ? !diploma.equals(teacher.diploma) : teacher.diploma != null) return false;
        if (experience != null ? !experience.equals(teacher.experience) : teacher.experience != null) return false;
        if (pictureFileName != null ? !pictureFileName.equals(teacher.pictureFileName) : teacher.pictureFileName != null)
            return false;
        if (grupps != null ? !grupps.equals(teacher.grupps) : teacher.grupps != null) return false;
        if (reviews != null ? !reviews.equals(teacher.reviews) : teacher.reviews != null) return false;
        return commands != null ? commands.equals(teacher.commands) : teacher.commands == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (diploma != null ? diploma.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + (pictureFileName != null ? pictureFileName.hashCode() : 0);
        result = 31 * result + (grupps != null ? grupps.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        result = 31 * result + (commands != null ? commands.hashCode() : 0);
        return result;
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
}
