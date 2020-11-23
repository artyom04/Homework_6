package model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public Person(String firstName, String lastName, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!(firstName.isEmpty())) {
            this.firstName = firstName;
        } else {
            System.out.println("First name can't be empty!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!(lastName.isEmpty())) {
            this.lastName = lastName;
        } else {
            System.out.println("Last name can't be empty!");
        }
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
