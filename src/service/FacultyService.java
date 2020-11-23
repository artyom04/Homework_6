package service;

import model.Course;
import model.Faculty;

import java.util.Scanner;

public class FacultyService {
    public Faculty createFaculty(Course[] courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Faculty Name: ");
        String facultyName = scanner.nextLine();
        return new Faculty(facultyName, courses);
    }
}
