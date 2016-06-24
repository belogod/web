package tables;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Course.findAll", query = "select c from Сourse c ")
})
public class Сourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String week;
    private String time;
    private String price;
    private String text;



    public Сourse(String week, String time, String price, String text) {

        this.week = week;
        this.time = time;
        this.price = price;
        this.text = text;

    }

    public Сourse() {
    }



    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Сourse сourse = (Сourse) o;

        if (id != null ? !id.equals(сourse.id) : сourse.id != null) return false;
        if (week != null ? !week.equals(сourse.week) : сourse.week != null) return false;
        if (time != null ? !time.equals(сourse.time) : сourse.time != null) return false;
        if (price != null ? !price.equals(сourse.price) : сourse.price != null) return false;
        return text != null ? text.equals(сourse.text) : сourse.text == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (week != null ? week.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Сourse{" +
                "id=" + id +
                ", week='" + week + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @ManyToOne(optional = false)
    private Title title;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}

