package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * List Test using Item class
 * Test for:    Add, Remove, Find
 *
 */

import com.sun.source.tree.UsesTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    List<Item> listItem = new ArrayList<>();
    Item itemOne = new Item("Book", 83.95);
    Item itemTwo = new Item("Pencil", 19.95);
    Item itemThree = new Item("Pen", 50.00);
    Item itemFour = new Item("Ruler", 12.95);

    @BeforeEach
    void setUp() {
        listItem.add(itemOne);
        listItem.add(itemTwo);
        listItem.add(itemThree);
    }

    //Test to add item to list:
    @Test
    void addTest() {
        //Add itemFour to list
        listItem.add(itemFour);
        //size = the size of the list (4)
        int size = listItem.size();
        assertEquals(4, size);
    }

    //Test to remove item from list
    @Test
    void removeTest() {
        listItem.remove(itemTwo);
        int size = listItem.size();
        assertEquals(2, size);
    }

    //Find Test:
    @Test
    void findTest() {
        //Passes if itemOne is in the list
        assertTrue(listItem.contains(itemOne));
    }
}