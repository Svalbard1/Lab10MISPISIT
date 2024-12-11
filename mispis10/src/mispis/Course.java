package mispis;

import java.util.ArrayList;
import java.util.Collection;

public class Course {
    private Collection<Lecturer> teaches = new ArrayList<>();
    private String name;
    private int id;
    private float hours;

    public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
        this.teaches = teaches != null ? teaches : new ArrayList<>();
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public Course() {
    }

    public void addNewTeacher(Lecturer lecturer) {
        this.teaches.add(lecturer);
        System.out.println("Новый преподаватель зачислен на курс");
    }

    public Collection<Lecturer> getTeaches() {
        return teaches;
    }

    public void setTeaches(Collection<Lecturer> teaches) {
        this.teaches = teaches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
