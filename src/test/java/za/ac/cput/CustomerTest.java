package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer testCustOne = new Customer("Mike", "Small", 902);
    Customer testCustTwo = new Customer("Henry", "Ford", 903);
    Customer testCustThree = new Customer("Elon", "Musk", 905);
    Customer testCustFour = new Customer("John", "Jerry", 910);
    Map<Integer, Customer> mapCustomer = new HashMap<>();

    @BeforeEach
    void setUp() {
        mapCustomer.put(0, testCustOne);
        mapCustomer.put(1, testCustTwo);
        mapCustomer.put(2, testCustThree);
    }

    //Add:
    @Test
    void addTestCustomer() {
        mapCustomer.put(3, testCustFour);
        int mapSize = mapCustomer.size();
        assertEquals(4, mapSize);

    }

    //Remove:
    @Test
    void removeTestCustomer() {
        //Removing object at key = 1
        mapCustomer.remove(1);
        int mapSize = mapCustomer.size();
        //Checks if the size of the map has changed from 3 to 2
        assertEquals(2, mapSize);
        //Checking if key=1 exists, if it returns false, this test passes.
        assertFalse(mapCustomer.containsKey(1));
    }

    //Find:
    @Test
    void findTestCustomer() {
        int mapSize = mapCustomer.size();
        assertEquals(3, mapSize);
    }


}