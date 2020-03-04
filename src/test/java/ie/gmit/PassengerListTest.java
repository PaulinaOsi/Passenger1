package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import ie.gmit.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;

public class PassengerListTest {

    private Passenger myPassenger;
    private PassengerList list;

    @BeforeAll
    @DisplayName("Starting tests")
    public static void print(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New instance of Student & StudentList")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myPassenger = new Passenger();
        list = new PassengerList();
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }


    @Test
    @Disabled
    @DisplayName("Valid ArrayList Entry test")
    void testStudentList(TestInfo testInfo)
    {
        PassengerList list = new PassengerList();
        Passenger passenger1 = new Passenger("Mr", "john","0123456789","0123456789",27);
        list.addPassenger(passenger1);
        assertEquals(passenger1,list.findByName("John"));
    }

    @Test
    @DisplayName("Invalid ArrayList Entry test")
    void testStudentListInvalid(TestInfo testInfo)
    {
        Passenger p1 = new Passenger("Mr", "john","0123456789","0123456789",27);
        Passenger p2 = new Passenger("Mr", "john","0123456789","0123456789",27);
        list.addPassenger(p1);
        Assertions.assertThrows(InvalidParameterException.class, () -> {
            list.addPassenger(p2);
        });
    }

    @Test
    @DisplayName("Invalid ArrayList Search")
    void testStudentListSearch(TestInfo testInfo)
    {
        Passenger p1 = new Passenger("Mr", "john","0123456789","0123456789",27);
        list.addPassenger(p1);
        assertEquals(null,list.findByName("Paul"));
    }

    @AfterAll
    @DisplayName("Testing complete")
    public static void done(){
        System.out.println("Testing Complete");
    }
}
