package test;

import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        //Creation of Courses and Courses Arrays
        System.out.println("Creating Courses");
        CourseService courseService = new CourseService();
        System.out.println("Course 1: ");
        Course courseOne = courseService.createCourse();
        System.out.println("Course 2: ");
        Course courseTwo = courseService.createCourse();
        System.out.println("Course 3: ");
        Course courseThree = courseService.createCourse();
        System.out.println("Course 4: ");
        Course courseFour = courseService.createCourse();
        Course[] coursesArrayOne = {courseOne, courseTwo, courseThree};
        Course[] coursesArrayTwo = {courseOne, courseTwo, courseFour};

        //Creation of Faculties
        System.out.println("Creating Faculties");
        FacultyService facultyService = new FacultyService();
        System.out.println("Faculty 1: ");
        Faculty facultyOne = facultyService.createFaculty(coursesArrayOne);
        System.out.println("Faculty 2: ");
        Faculty facultyTwo = facultyService.createFaculty(coursesArrayTwo);

        //Creation of a Student and Printing Information
        System.out.println("Creating Students");
        StudentService studentService = new StudentService();
        System.out.println("Student 1: ");
        Student studentOne = studentService.createStudent(facultyOne);
        System.out.println("Printing Student 1: ");
        System.out.println(studentOne);
        System.out.println("Student 2: ");
        Student studentTwo = studentService.createStudent(facultyTwo);
        System.out.println("Printing Student 2: ");
        System.out.println(studentTwo);

        //Creation and Testing of Lecturer
        System.out.println("**********************");
        System.out.println("Creating Lecturer");
        LecturerService lecturerService = new LecturerService();
        Lecturer lecturer = lecturerService.createLecturer(new Course[]{courseOne});
        System.out.println("Printing Lecturer");
        System.out.println(lecturer);
        System.out.println("Is Eligible For Buying Stock: " + ((lecturer.isEligibleForStock()) ? "Yes" : "No"));
        System.out.println("Lecturer Trimester Bonus: " + lecturer.calculateTrimesterBonus());
        System.out.println("Lecturer Yearly Bonus: " + lecturer.calculateYearlyBonus());

        //Creation and Testing of Teaching Assistant
        System.out.println("***********************");
        System.out.println("Creating Teaching Assistant");
        TeachingAssistantService teachingAssistantService = new TeachingAssistantService();
        TeachingAssistant teachingAssistant = teachingAssistantService.createTeachingAssistant(new Course[]{courseFour});
        System.out.println("Printing Teaching Assistant");
        System.out.println(teachingAssistant);
        System.out.println("Is Eligible For Buying Stock: " + ((teachingAssistant.isEligibleForStock()) ? "Yes" : "No"));
        System.out.println("Lecturer Trimester Bonus: " + teachingAssistant.calculateTrimesterBonus());
        System.out.println("Lecturer Yearly Bonus: " + teachingAssistant.calculateYearlyBonus());
    }
}
