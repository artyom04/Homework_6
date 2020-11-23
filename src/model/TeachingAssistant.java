package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class TeachingAssistant extends Employee {
    private String degree;
    private Course[] taughtCourses;

    public TeachingAssistant(String firstName, String lastName, LocalDate birthday, String taxPayerId, double salary,
                             byte stage, String degree, Course[] taughtCourses) {
        super(firstName, lastName, birthday, taxPayerId, salary, stage);
        setDegree(degree);
        setTaughtCourses(taughtCourses);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if (!(degree.isEmpty())) {
            this.degree = degree;
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
                "Degree: " + this.getDegree() + "\n" + "Taught Courses: " + Arrays.toString(this.getTaughtCourses());
    }
}
