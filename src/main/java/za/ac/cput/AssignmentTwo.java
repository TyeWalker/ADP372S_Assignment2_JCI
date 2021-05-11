package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * Staff Class.
 * Contains:    Constructor, Getters, Setters, and toString,
 *              equals() and hashCode() for staffNumber
 *
 * Numbered:
 * i.   Collections
 * ii.  Map
 * iii. Set
 * iv.  List
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssignmentTwo {



    //Customer Objects:
    Customer custOne = new Customer("Biggie", "Smalls", 877);
    Customer custTwo = new Customer("Kanye", "West", 776);
    Customer custThree = new Customer("John", "Cena", 555);

    //Staff Objects:
    Staff staffOne = new Staff(1234, "John", "Doe", "1990-05-29", "Maintenance", 25.00);
    Staff staffTwo = new Staff(1314, "Jane", "Flower", "1996-12-29", "Accountant", 40.59);
    Staff staffThree = new Staff(1234, "Bruce", "Wayne", "1979-06-06", "CEO", 1);

    //i.    Collections:



    //ii.   Map:

    Map<Integer, Customer> mapCustomer = new HashMap<>();

    //Add:
    public void addCustomer() {
        mapCustomer.put(0, custOne);
        mapCustomer.put(1, custTwo);
        mapCustomer.put(2, custThree);
    }

    //Remove:
    public void removeCustomer() {
        //Add customers to map
        addCustomer();
        //Remove: This removes the object at key=1 (custTwo)
        mapCustomer.remove(1);
    }

    //Find:
    public void findCustomer() {
        //Add customers to map
        addCustomer();

    }





    //iii.  Set:

    Set<Staff> staffMembers = new HashSet<>();

    //Add:
    public void addStaff() {
        staffMembers.add(staffOne);
        staffMembers.add(staffTwo);
        staffMembers.add(staffThree);
    }

    //Remove:
    public void removeStaffObj() {
        //Adding staff:
        addStaff();
        //Remove staffTwo:
        staffMembers.remove(staffTwo);
    }

    //Find:
    public void findStaff() {
        //Adding staff:
        addStaff();
        //Finding staff: Returns true if staff found
        System.out.println(staffMembers.contains(staffThree));
    }

    //iv.   List


    public static void main(String[] args) {

    }
}
