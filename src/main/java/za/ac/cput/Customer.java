package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * Contains:    Constructor, Getters, Setters, and toString,
 *              equals() and hashCode() for staffNumber
 *
 */

import java.util.Objects;

public class Customer {

    private String firstName, lastName;
    private int custNumber;

    public Customer(String firstName, String lastName, int custNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.custNumber = custNumber;
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

    public int getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(int custNumber) {
        this.custNumber = custNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", custNumber=" + custNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custNumber == customer.custNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(custNumber);
    }
}
