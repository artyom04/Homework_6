package service;

import model.Faculty;
import model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentService {
    public Student createStudent(Faculty faculty) {
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
        System.out.println("Enter the Student ID: ");
        int studentId = scanner.nextInt();
        return new Student(firstName, lastName, date, studentId, faculty);
    }
}
