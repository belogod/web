package tables;

import javax.persistence.*;

/**
 * Created by Belogod on 27.04.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Gallery.findAll", query = "select g from Gallery g")
})


public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(length = 50)
    private String img;
    @Column(length = 50)
    private String image;
    @Column(length = 50)
    private String comment;


    @ManyToOne(optional = false)
    private Teacher teacher;

    public Gallery(String img, String image, String comment) {
        this.img = img;
        this.image = image;
        this.comment = comment;
    }

    public Gallery() {
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

        Gallery gallery = (Gallery) o;

        if (id != null ? !id.equals(gallery.id) : gallery.id != null) return false;
        if (img != null ? !img.equals(gallery.img) : gallery.img != null) return false;
        if (image != null ? !image.equals(gallery.image) : gallery.image != null) return false;
        if (comment != null ? !comment.equals(gallery.comment) : gallery.comment != null) return false;
        return teacher != null ? teacher.equals(gallery.teacher) : gallery.teacher == null;

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
