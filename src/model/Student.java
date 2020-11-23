package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Student extends Person {
    private int studentId;
    private Faculty faculty;

    public Student(String firstName, String lastName, LocalDate birthday, int studentId, Faculty faculty) {
        super(firstName, lastName, birthday);
        setStudentId(studentId);
        setFaculty(faculty);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId >= 1000000 && studentId <= 9999999) {
            this.studentId = studentId;
        } else {
            System.out.println("Student Id should be 7-digit number!");
        }
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "First Name: " + this.getFirstName() + ", Last Name: " + this.getLastName() + ", Birthday: " +
                this.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" + "Id: " +
                this.getStudentId() + ", Faculty: " + this.getFaculty().getFacultyName() + "\n" + "Courses: \n" +
                Arrays.toString(this.getFaculty().getCourses());
    }
}