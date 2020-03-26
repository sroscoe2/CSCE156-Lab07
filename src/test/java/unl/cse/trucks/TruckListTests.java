package unl.cse.trucks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

class TruckListTests {

    private TruckList testList;

    @BeforeEach
    void setUp() {
        testList = new TruckList();
    }

    @Test
    void getSizeAddToStart() {
        Truck testElement = Truck.createRandomTruck();
        for (int i = 0; i < 10; i++) {
            assertEquals(i, testList.getSize());
            testList.addToStart(testElement);
        }
    }

    @Test
    void getSizeAddToEnd() {
        Truck testElement = Truck.createRandomTruck();
        for (int i = 0; i < 10; i++) {
            assertEquals(i, testList.getSize());
            testList.addToEnd(testElement);
        }
    }

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

    @Test
    void clear() {
        assertEquals(0, testList.getSize());
        testList.clear();
        assertEquals(0, testList.getSize());
        testList.addToEnd(Truck.createRandomTruck());
        testList.addToStart(Truck.createRandomTruck());
    }

    @Test
    void addToStart() {
        for (int i = 0; i < 10; i++) {
            Truck testElement = Truck.createRandomTruck();
            testList.addToStart(testElement);
            assertEquals(testElement, testList.getTruck(0));
        }
    }

    @Test
    void addToEnd() {
        for (int i = 0; i < 10; i++) {
            Truck testElement = Truck.createRandomTruck();
            testList.addToEnd(testElement);
            assertEquals(testElement, testList.getTruck(i));
        }
    }

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
