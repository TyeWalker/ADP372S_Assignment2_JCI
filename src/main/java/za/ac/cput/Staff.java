package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * Staff Class.
 * Contains:    Constructor, Getters, Setters, and toString
 *              equals() and hashCode() for staffNumber
 */

import java.util.Objects;

public class Staff {
    private int staffNumber;
    private String firstName, lastName, DOB, position;
    private double wagePH;

    public Staff(int staffNumber, String firstName, String lastName, String DOB, String position, double wagePH) {
        this.staffNumber = staffNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.position = position;
        this.wagePH = wagePH;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWagePH() {
        return wagePH;
    }

    public void setWagePH(double wagePH) {
        this.wagePH = wagePH;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffNumber=" + staffNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", position='" + position + '\'' +
                ", wagePH=" + wagePH +
                '}';
    }

    //Equals and hashCode: Using staffNumber
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffNumber == staff.staffNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNumber);
    }
}
