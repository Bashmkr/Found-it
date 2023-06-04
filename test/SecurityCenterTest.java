

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;
/**
 *
 * @author basha
 */
public class SecurityCenterTest {
    
    public SecurityCenterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSecurityLocation method, of class SecurityCenter.
     */
    @Ignore
    public void testGetSecurityLocation() {
        System.out.println("getSecurityLocation");
        SecurityCenter instance = null;
        String expResult = "";
        String result = instance.getSecurityLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecurityLocation method, of class SecurityCenter.
     */
    @Ignore
    public void testSetSecurityLocation() {
        System.out.println("setSecurityLocation");
        String securityLocation = "";
        SecurityCenter instance = null;
        instance.setSecurityLocation(securityLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecurityNumber method, of class SecurityCenter.
     */
   @Ignore
    public void testGetSecurityNumber() {
        System.out.println("getSecurityNumber");
        SecurityCenter instance = null;
        int expResult = 0;
        int result = instance.getSecurityNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecurityNumber method, of class SecurityCenter.
     */
   @Ignore
    public void testSetSecurityNumber() {
        System.out.println("setSecurityNumber");
        int securityNumber = 0;
        SecurityCenter instance = null;
        instance.setSecurityNumber(securityNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupervisorName method, of class SecurityCenter.
     */
    @Ignore
    public void testGetSupervisorName() {
        System.out.println("getSupervisorName");
        SecurityCenter instance = null;
        String expResult = "";
        String result = instance.getSupervisorName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupervisorName method, of class SecurityCenter.
     */
    @Ignore
    public void testSetSupervisorName() {
        System.out.println("setSupervisorName");
        String supervisorName = "";
        SecurityCenter instance = null;
        instance.setSupervisorName(supervisorName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerRecipientInfo method, of class SecurityCenter.
     */
    @Ignore
    public void testRegisterRecipientInfo() {
        System.out.println("registerRecipientInfo");
        SecurityCenter.registerRecipientInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeLostItemStatus method, of class SecurityCenter.
     */
    @Test
    public void testChangeLostItemStatus() {
System.out.println("updateItemInfo");
        Student student = new Student("2102002","Noran");
        SecurityCenter SecurityCenter = new SecurityCenter("FCIT");
        FoundItem foundItem = new FoundItem(SecurityCenter, "Glasses");
        String expResult = "Recipient " + student.getName() + " with ID " + student.getID() + " successfully registered."
                + "\n_______________________________________________"
                + "\nThe Item has been received!";;
        String result = SecurityCenter.updateItemInfo(foundItem, student);
        assertEquals(expResult, result);
    }
    
}
