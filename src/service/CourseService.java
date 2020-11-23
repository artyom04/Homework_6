package service;

import model.Course;

import java.util.Scanner;

public class CourseService {
    public Course createCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Course Name: ");
        String courseName = scanner.nextLine();
        System.out.println("Enter the Course ID: ");
        int courseId = scanner.nextInt();
        System.out.println("Enter the Course Credit: ");
        byte courseCredit = scanner.nextByte();
        return new Course(courseName, courseId, courseCredit);
    }
}