package model;

import java.time.LocalDate;

public class Employee extends Person implements EligibleForCompanyStockBuying, EmployeeBonus {
    private String taxPayerId;
    private double salary;
    private byte stage;

    public Employee(String firstName, String lastName, LocalDate birthday, String taxPayerId, double salary,
                    byte stage) {
        super(firstName, lastName, birthday);
        setSalary(salary);
        setTaxPayerId(taxPayerId);
        setStage(stage);
    }

    public String getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        if (taxPayerId.matches("[A-Z]{2}[0-9]{6}")) {
            this.taxPayerId = taxPayerId;
        } else {
            System.out.println("Tax Payer ID must be of the following pattern: AA000000");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public byte getStage() {
        return stage;
    }

    public void setStage(byte stage) {
        if (stage > 0 && stage <= 65) {
            this.stage = stage;
        } else {
            System.out.println("Stage must be between 0 and 65!");
        }
    }

    @Override
    public boolean isEligibleForStock() {
        return stage >= 25;
    }

    @Override
    public double calculateTrimesterBonus() {
        return 3 * (this.getSalary() * 0.2);
    }

    @Override
    public double calculateYearlyBonus() {
        return (12 * this.getSalary() * 0.3);
    }
}
