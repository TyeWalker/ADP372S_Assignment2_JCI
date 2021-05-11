package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    Set<Staff> staffMembers = new HashSet<>();
    Staff staffOne = new Staff(10225, "Big", "Daddy", "1900-05-29", "Driver", 9999);
    Staff staffTwo = new Staff(10332, "Coin", "Age", "1900-12-29", "Accountant", 9999);
    Staff staffThree = new Staff(10567, "Pepperoni", "Pizza", "1900-06-06", "Food", 9999);
    Staff staffFour = new Staff(10888, "Wood", "Stock", "1890-10-29", "Lumber", 9999);

    @BeforeEach
    void setUp() {
        staffMembers.add(staffOne);
        staffMembers.add(staffTwo);
        staffMembers.add(staffThree);

    }

    @Test
    void addTest() {
        staffMembers.add(staffFour);
        //size = the size of the list (4)
        int size = staffMembers.size();
        assertEquals(4, size);
    }

    //Test to remove item from list
    @Test
    void removeTest() {
        staffMembers.remove(staffTwo);
        int size = staffMembers.size();
        assertEquals(2, size);
    }

    //Find Test:
    @Test
    void findTest() {
        //Passes if itemOne is in the list
        assertTrue(staffMembers.contains(staffOne));
    }
}