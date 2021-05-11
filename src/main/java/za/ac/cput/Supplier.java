package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * Supplier Class.
 * Contains Constructor, Getters, Setters, and toString
 */

public class Supplier {

    private String supName, supContact;
    private double accBalance;

    public Supplier(String supName, String supContact, double accBalance) {
        this.supName = supName;
        this.supContact = supContact;
        this.accBalance = accBalance;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupContact() {
        return supContact;
    }

    public void setSupContact(String supContact) {
        this.supContact = supContact;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supName='" + supName + '\'' +
                ", supContact='" + supContact + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }

}
