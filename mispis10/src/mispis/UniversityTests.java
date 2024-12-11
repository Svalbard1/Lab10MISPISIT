package mispis;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTests {

    @Test
    void testAddNewTeacherToCourse() {
        //Arrange
        var course = new Course(new ArrayList<>(), "Test Course", 101, 20);
        var lecturer = new Lecturer(1, 10, "Test Lecturer", "test@university.com", 5);

        //act
        course.addNewTeacher(lecturer);

        //assert
        assertTrue(course.getTeaches().contains(lecturer), "Преподаватель должен быть добавлен в список teaches");
    }

    @Test
    void testSetNameForCourse() {
        var course = new Course(new ArrayList<>(), "Old Name", 101, 20);

        course.setName("New Name");

        assertEquals("New Name", course.getName(), "Название курса должно быть обновлено");
    }

    @Test
    void testDeanExpelStudent() {
        var dean = new Dean("Test Dean");

        assertDoesNotThrow(dean::expelStudent, "Метод expelStudent не должен выбрасывать исключений");
    }

    @Test
    void testDeanMakeTransferStudents() {
        var dean = new Dean("Test Dean");

        assertDoesNotThrow(dean::makeTransferStudents, "Метод makeTransferStudents не должен выбрасывать исключений");
    }

    @Test
    void testAdministrativeEmployeeCheckEquipment() {
        var admin = new AdministrativeEmployee("Test Admin");

        assertDoesNotThrow(admin::checkEquipment, "Метод checkEquipment не должен выбрасывать исключений");
    }

    @Test
    void testParticipationAddTime() {
        var participation = new Participation(10);

        participation.addTime(5);

        assertEquals(15, participation.getHours(), "Количество часов должно увеличиться");
    }

    @Test
    void testProjectSetName() {
        var project = new Project("Old Project", new Date(), new Date());

        project.setName("New Project");

        assertEquals("New Project", project.getName(), "Название проекта должно быть обновлено");
    }

    @Test
    void testResearchAssociateUpdateFieldOfStudy() {
        var associate = new ResearchAssociate("Test Associate", "Old Field");

        associate.updateFieldOfStudy("New Field");

        assertEquals("New Field", associate.fieldOfStudy, "Область изучения должна быть обновлена");
    }

    @Test
    void testFacultyAddNewDepartment() {
        var faculty = new Faculty(new Dean("Test Dean"), "Test Faculty", new ArrayList<>());
        var department = new Department("Test Department", new ArrayList<>());

        faculty.addNewDepartment(department);

        assertTrue(faculty.getDepartments().contains(department), "Новый департамент должен быть добавлен");
    }

    @Test
    void testInstituteAddNewFaculty() {
        var institute = new Institute("Test Institute", "Test Address", new ArrayList<>());
        var faculty = new Faculty(new Dean("Test Dean"), "Test Faculty", new ArrayList<>());

        institute.addNewFaculty(faculty);

        assertTrue(institute.getFaculties().contains(faculty), "Новый факультет должен быть добавлен");
    }
}

