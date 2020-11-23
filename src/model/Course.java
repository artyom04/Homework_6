package model;

public class Course {
    private String courseName;
    private int courseId;
    private byte courseCredit;

    public Course(String courseName, int courseId, byte courseCredit) {
        setCourseName(courseName);
        setCourseId(courseId);
        setCourseCredit(courseCredit);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (!(courseName.isEmpty())) {
            this.courseName = courseName;
        } else {
            System.out.println("Course name can't be empty!");
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        if (courseId >= 100000 && courseId <= 999999) {
            this.courseId = courseId;
        } else {
            System.out.println("Course Id should be 6-digit number!");
        }
    }

    public byte getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(byte courseCredit) {
        if (courseCredit > 0 && courseCredit <= 12) {
            this.courseCredit = courseCredit;
        } else {
            System.out.println("Course credit must be value between 1 and 12!");
        }
    }

    @Override
    public String toString() {
        return "Course Name: " + this.getCourseName() + ", Course Id: " + this.getCourseId() + ", Credit: " +
                this.getCourseCredit() + "\n";
    }
}