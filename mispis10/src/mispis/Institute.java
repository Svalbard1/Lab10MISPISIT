package mispis;

import java.util.ArrayList;
import java.util.Collection;

public class Institute {
    private String name;
    private String address;
    private Collection<Faculty> faculties = new ArrayList<>();

    public Institute(String name, String address, Collection<Faculty> faculties) {
        this.name = name;
        this.address = address;
        this.faculties = faculties != null ? faculties : new ArrayList<>();
    }

    public Institute() {
    }

    public void addNewFaculty(Faculty faculty) {
        this.faculties.add(faculty);
        System.out.println("Факультет добавлен");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Collection<Faculty> faculties) {
        this.faculties = faculties;
    }
}