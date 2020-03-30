package unl.cse.trucks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

/**
 * A JUnit test suite of test cases for the {@link TruckList} 
 * linked list implementation.
 *
 */
public class TruckListTests {

    private TruckList testList;

    /**
     * Initializes a new {@link TruckList} 
     */
    @BeforeEach
    void setUp() {
        testList = new TruckList();
    }

    /**
     * Tests that the {@link TruckList#getSize()} is correct after 
     * inserting a new {@link Truck} with the 
     * {@link TruckList#addToStart(Truck)} method. 
     */
    @Test
    void getSizeAddToStart() {
        Truck testElement = Truck.createRandomTruck();
        for (int i = 0; i < 10; i++) {
            assertEquals(i, testList.getSize());
            testList.addToStart(testElement);
        }
    }

    /**
     * Tests that the {@link TruckList#getSize()} is correct after 
     * inserting a new {@link Truck} with the 
     * {@link TruckList#addToEnd(Truck)} method. 
     */
    @Test
    void getSizeAddToEnd() {
        Truck testElement = Truck.createRandomTruck();
        for (int i = 0; i < 10; i++) {
            assertEquals(i, testList.getSize());
            testList.addToEnd(testElement);
        }
    }

    /**
     * Tests that the {@link TruckList#getSize()} is correct after 
     * removing a {@link Truck} with the {@link TruckList#remove(int)} 
     * method. 
     */
    @Test
    void getSizeRemove() {
        Truck testElement = Truck.createRandomTruck();
        for (int i = 0; i < 10; i++) {
            testList.addToStart(testElement);
        }

        Random randomRemover = new Random();
        for (int i = 10; i > 0; i--) {
            assertEquals(i, testList.getSize());
            testList.remove(randomRemover.nextInt(i));
        }
    }

    /**
     * Tests that the {@link TruckList#getSize()} is correct after 
     * clearing out the list using the {@link TruckList#clear()} 
     * method. 
     */
    @Test
    void clear() {
        assertEquals(0, testList.getSize());
        testList.clear();
        assertEquals(0, testList.getSize());
        testList.addToEnd(Truck.createRandomTruck());
        testList.addToStart(Truck.createRandomTruck());
    }

    /**
     * Tests that the {@link TruckList#addToStart(Truck)} is correct. 
     */
    @Test
    void addToStart() {
        for (int i = 0; i < 10; i++) {
            Truck testElement = Truck.createRandomTruck();
            testList.addToStart(testElement);
            assertEquals(testElement, testList.getTruck(0));
        }
    }

    /**
     * Tests that the {@link TruckList#addToEnd(Truck)} is correct. 
     */
    @Test
    void addToEnd() {
        for (int i = 0; i < 10; i++) {
            Truck testElement = Truck.createRandomTruck();
            testList.addToEnd(testElement);
            assertEquals(testElement, testList.getTruck(i));
        }
    }

    /**
     * Tests that the {@link TruckList#remove(int)} is correct. 
     */
    @Test
    void remove() {
        Truck[] testElements = {Truck.createRandomTruck(), Truck.createRandomTruck(), Truck.createRandomTruck(),
                Truck.createRandomTruck(), Truck.createRandomTruck()};

        for (Truck t : testElements) {
            testList.addToEnd(t);
        }

        assertEquals(testElements[0], testList.getTruck(0));
        assertEquals(testElements[1], testList.getTruck(1));
        assertEquals(testElements[2], testList.getTruck(2));
        assertEquals(testElements[3], testList.getTruck(3));
        assertEquals(testElements[4], testList.getTruck(4));
        assertEquals(5, testList.getSize());

        testList.remove(0);
        assertEquals(testElements[1], testList.getTruck(0));
        assertEquals(testElements[2], testList.getTruck(1));
        assertEquals(testElements[3], testList.getTruck(2));
        assertEquals(testElements[4], testList.getTruck(3));
        assertEquals(4, testList.getSize());

        testList.remove(3);
        assertEquals(testElements[1], testList.getTruck(0));
        assertEquals(testElements[2], testList.getTruck(1));
        assertEquals(testElements[3], testList.getTruck(2));
        assertEquals(3, testList.getSize());

        testList.remove(1);
        assertEquals(testElements[1], testList.getTruck(0));
        assertEquals(testElements[3], testList.getTruck(1));
        assertEquals(2, testList.getSize());

        testList.remove(0);
        assertEquals(testElements[3], testList.getTruck(0));
        assertEquals(1, testList.getSize());

        testList.remove(0);
        assertEquals(0, testList.getSize());
    }

    /**
     * Tests that the {@link TruckList#getTruck(int)} is correct. 
     */
    @Test
    void getTruck() {
        Truck[] testElements = {Truck.createRandomTruck(), Truck.createRandomTruck(), Truck.createRandomTruck(),
                Truck.createRandomTruck(), Truck.createRandomTruck()};

        for (Truck t : testElements) {
            testList.addToEnd(t);
        }

        assertEquals(testElements[0], testList.getTruck(0));
        assertEquals(testElements[1], testList.getTruck(1));
        assertEquals(testElements[2], testList.getTruck(2));
        assertEquals(testElements[3], testList.getTruck(3));
        assertEquals(testElements[4], testList.getTruck(4));
    }


}
