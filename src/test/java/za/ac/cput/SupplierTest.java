package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * List Test using Supplier class
 * Test for:    Add, Remove, Find
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {

    //Initial capacity: 10
    Collection<Supplier> testCollectionSup = new LinkedHashSet<>(10);
    Supplier testSupOne = new Supplier("Bidvest", "082418246", 501);
    Supplier testSupTwo = new Supplier("distriliq", "087115161", 1053);
    Supplier testSupThree = new Supplier("John's Supplies", "091564565", 8053);
    Supplier testSupFour = new Supplier("Rogers Veg", "0215464564", 994);

    @BeforeEach
    void setUp() {
        testCollectionSup.add(testSupOne);
        testCollectionSup.add(testSupTwo);
        testCollectionSup.add(testSupThree);
    }

    @Test
    void testAddCollection() {
        testCollectionSup.add(testSupFour);
        int colSize = testCollectionSup.size();
        assertEquals(4, colSize);
    }

    @Test
    void testRemoveCollection() {
        testCollectionSup.remove(testSupTwo);
        int colSize = testCollectionSup.size();
        assertEquals(2, colSize);
    }

    @Test
    void testFindCollection() {
        assertTrue(testCollectionSup.contains(testSupOne));
    }
}