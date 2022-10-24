package entities;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private String title;
    private double price;

    public Course() {
    }

    public Course(int id, String name, Teacher teacher, String title, double price) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
