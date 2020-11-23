package model;

import java.util.Arrays;

public class Faculty {
    private String facultyName;
    private Course[] courses;

    public Faculty(String facultyName, Course[] courses) {
        setCourses(courses);
        setFacultyName(facultyName);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        if (!(facultyName.isEmpty())) {
            this.facultyName = facultyName;
        } else {
            System.out.println("Faculty name can't be empty!");
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        if (courses.length != 0) {
            this.courses = courses;
        } else {
            System.out.println("Faculty must have at least one course!");
        }
    }

    @Override
    public String toString() {
        return "Faculty Name: " + this.getFacultyName() + "\n" + "Courses in Faculty: " + "\n" +
                Arrays.toString(this.getCourses());
    }
}