package service;

import model.Course;
import model.Lecturer;

import java.time.LocalDate;
import java.util.Scanner;

public class LecturerService {
    public Lecturer createLecturer(Course[] taughtCourses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name: ");
        String lastName = scanner.next();
        System.out.println("Enter the Year of Birthday: ");
        int year = scanner.nextInt();
        System.out.println("Enter the Month of Birthday: ");
        int month = scanner.nextInt();
        System.out.println("Enter the Day of Birthday: ");
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("Enter the Tax Payer ID: ");
        String taxPayerId = scanner.next();
        System.out.println("Enter the Salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter the Stage: ");
        byte stage = scanner.nextByte();
        System.out.println("Enter the Academic Degree: ");
        String academicDegree = scanner.next();
        return new Lecturer(firstName, lastName, date, taxPayerId, salary, stage, academicDegree, taughtCourses);
    }
}
