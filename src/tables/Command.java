package tables;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Belogod on 27.04.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Command.findAll", query = "select cm from Command cm")
})


public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String img;
    private String image;
    private String comment;


    @ManyToOne(optional = false)
    private Teacher teacher;

    public Command(String img, String image, String comment) {
        this.img = img;
        this.image = image;
        this.comment = comment;
    }

    public Command() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        if (id != null ? !id.equals(command.id) : command.id != null) return false;
        if (img != null ? !img.equals(command.img) : command.img != null) return false;
        if (image != null ? !image.equals(command.image) : command.image != null) return false;
        if (comment != null ? !comment.equals(command.comment) : command.comment != null) return false;
        return teacher != null ? teacher.equals(command.teacher) : command.teacher == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        return result;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
