package mispis;

import java.util.ArrayList;
import java.util.Collection;

public class Faculty {
    private Dean dean;
    private String name;
    private Collection<Department> departments = new ArrayList<>();

    public Faculty(Dean dean, String name, Collection<Department> departments) {
        this.dean = dean;
        this.name = name;
        this.departments = departments != null ? departments : new ArrayList<>();
    }

    public Faculty() {
    }

    public void addNewDepartment(Department department) {
        this.departments.add(department);
        System.out.println("Добавлена новая кафедра");
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }

    public void updateDean(Dean dean) {

    }
}
