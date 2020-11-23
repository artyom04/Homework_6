package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Lecturer extends Employee {
    private String academicDegree;
    private Course[] taughtCourses;

    public Lecturer(String firstName, String lastName, LocalDate birthday, String taxPayerId, double salary, byte stage,
                    String academicDegree, Course[] taughtCourses) {
        super(firstName, lastName, birthday, taxPayerId, salary, stage);
        setAcademicDegree(academicDegree);
        setTaughtCourses(taughtCourses);
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        if (!(academicDegree.isEmpty())) {
            this.academicDegree = academicDegree;
        } else {
            System.out.println("Academic Degree can't be empty!");
        }
    }

    public Course[] getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(Course[] taughtCourses) {
        if (taughtCourses.length != 0) {
            this.taughtCourses = taughtCourses;
        } else {
            System.out.println("Lecturer must have at least one course");
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getFirstName() + ", Surname: " + this.getLastName() + ", Birthday: " +
                this.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" + "Tax Payer ID: "
                + this.getTaxPayerId() + ", Salary: " + this.getSalary() + ", Stage: " + this.getStage() + "\n" +
                "Academic Degree: " + this.getAcademicDegree() + "\n" + "Taught Courses: "
                + Arrays.toString(this.getTaughtCourses());
    }
}
