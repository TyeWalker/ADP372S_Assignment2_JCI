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
 * i.   Collections - Supplier
 * ii.  Map         - Customer
 * iii. Set         - Staff
 * iv.  List        - Item
 */

import java.util.*;

public class AssignmentTwo {


    //Supplier Objects:
    Supplier supOne = new Supplier("New Balance", "555767482", 726581);
    Supplier supTwo = new Supplier("Nike", "666821549", 105553);
    Supplier supThree = new Supplier("Sony", "743564289", 8531000);

    //Customer Objects:
    Customer custOne = new Customer("Biggie", "Smalls", 877);
    Customer custTwo = new Customer("Kanye", "West", 776);
    Customer custThree = new Customer("John", "Cena", 555);

    //Staff Objects:
    Staff staffOne = new Staff(1234, "John", "Doe", "1990-05-29", "Maintenance", 25.00);
    Staff staffTwo = new Staff(1314, "Jane", "Flower", "1996-12-29", "Accountant", 40.59);
    Staff staffThree = new Staff(1234, "Bruce", "Wayne", "1979-06-06", "CEO", 1);

    //Item Objects:
    Item itemOne = new Item("Phone", 6999.95);
    Item itemTwo = new Item("Jacket", 5499.95);
    Item itemThree = new Item("CD", 50.00);

    //i.    Collections:

    //Initial Capacity: 10
    Collection<Supplier> supCollection = new LinkedHashSet<>(10);

    //Add:
    public void addSupplier() {
        supCollection.add(supOne);
        supCollection.add(supTwo);
        supCollection.add(supThree);
    }

    //Remove:
    public void removeSupplier() {
        //Add suppliers to collection:
        addSupplier();
        //Remove supTwo:
        supCollection.add(supTwo);
    }

    //Find:
    public void findSupplier() {
        //Add suppliers to collection:
        addSupplier();
        //Finding item: Prints true if list contains supThree
        System.out.println(supCollection.contains(supThree));
    }


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

    //Not complete:
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
        //Finding staff: Prints true if staff found
        System.out.println(staffMembers.contains(staffThree));
    }




    //iv.   List

    List<Item> listItem = new ArrayList<>();

    //Add:
    public void addItem() {
        listItem.add(itemOne);
        listItem.add(itemTwo);
        listItem.add(itemThree);
    }

    //Remove:
    public void removeItemObj() {
        //Adding objects:
        addItem();
        //Remove itemTwo:
        listItem.remove(itemTwo);
    }

    public void findItem() {
        //Adding objects:
        addItem();
        //Finding item: Prints true if list contains itemThree
        System.out.println(listItem.contains(itemThree));
    }


    public static void main(String[] args) {
        AssignmentTwo a = new AssignmentTwo();

    }
}
