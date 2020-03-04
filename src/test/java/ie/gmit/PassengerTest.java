package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import java.security.InvalidParameterException;

public class PassengerTest {


    /************SETTING UP OBJECT INSTANCE*************/

    private Passenger myPassenger;

    /**************************************************/



    /************SETTING UP PRE TEST*************/
    @BeforeAll
    @DisplayName("Starting tests")
    public static void print(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New instance of Passenger")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myPassenger = new Passenger();
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }
    /**************************************************/


    /************TESTING GETTERS AND SETTERS*************/
    @Test
    @DisplayName("Testing Getters and Setters of Student")
    void testGettersAndSetters(TestInfo testInfo)
    {
        //title
        myPassenger.setTitle("Mr");
        assertEquals(myPassenger.getTitle(),"Mr");
        myPassenger.setTitle("Mrs");
        assertEquals(myPassenger.getTitle(),"Mrs");
        myPassenger.setTitle("Ms");
        assertEquals(myPassenger.getTitle(),"Ms");
        //name
        myPassenger.setName("Paul");
        assertEquals(myPassenger.getName(),"Paul");
        //id
        myPassenger.setId("0123456789");
        assertEquals(myPassenger.getId(),"0123456789");
        //Phone
        myPassenger.setPhone("0123456789");
        assertEquals(myPassenger.getPhone(),"0123456789");
        //Age
        myPassenger.setAge(17);
        assertEquals(myPassenger.getAge(),17);
    }

    @Test
    @DisplayName("Invalid title setter test")
    void testTitleInvalid(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setTitle("ze");
        });
    }

    @Test
    @DisplayName("Invalid name setter test")
    void testNameFalse(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setName("me");
        });
    }

    @Test
    @DisplayName("Invalid id setter Test")
    void testIdInvalid(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setId("798");
        });
    }

    @Test
    @DisplayName("Invalid phone setter test")
    void testPhoneInvalid(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setPhone("097");
        });
    }

    @Test
    @DisplayName("Invalid age setter test")
    void testAgeInvalid(TestInfo testInfo)
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myPassenger.setAge(10);
        });
    }
    /**************************************************/



//     /************TESTING CONSTRUCTORS*************/
//    @Test
//    @DisplayName("Invalid Constructor Test (invalid name)")
//    void testConstructorStudentName(TestInfo testInfo)
//    {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            new Passenger("Mr", "john","0123456789","0123456789",27);
//        });
//    }

    @Test
    @DisplayName("Valid Constructor test")
    void testConstructorValid(TestInfo testInfo)
    {
        Passenger p1 = new Passenger("Mr", "john","0123456789","0123456789",27);
        assertEquals("Mr",p1.getTitle());
        assertEquals("john",p1.getName());
        assertEquals("0123456789",p1.getId());
        assertEquals("0123456789",p1.getPhone());
        assertEquals(27,p1.getAge());

    }
    /**************************************************/


    /************TESTING COMPLETE*************/

    @AfterAll
    @DisplayName("Testing complete")
    public static void done(){
        System.out.println("Testing Complete");
    }
    /**************************************************/

}
