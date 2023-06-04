
import java.util.ArrayList;
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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getDescription method, of class Item.
     */
     @Ignore
    public void testGetDescription() {
        System.out.println("getDescription");
        Item instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Item.
     */
     @Ignore
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "";
        Item instance = null;
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Item.
     */
     @Ignore
    public void testGetStatus() {
        System.out.println("getStatus");
        Item instance = null;
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Item.
     */
     @Ignore
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean itemLostStatus = false;
        Item instance = null;
        instance.setStatus(itemLostStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareDescription method, of class Item.
     */
     @Ignore
    public void testCompareDescription() {
        System.out.println("compareDescription");
        ArrayList<FoundItem> founditem = null;
        Item.compareDescription(founditem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MatchingFoundItemInfo method, of class Item.
     */
    @Test (timeout = 10)
    public void testMatchingFoundItemInfo() {
       System.out.println("MatchingFoundItemInfo");
        String word = "iphone";
        SecurityCenter SecurityCenter = new SecurityCenter("FCIT");
        FoundItem Founditem = new FoundItem(SecurityCenter, "iphone");
        FoundItem expResult = Founditem;
        FoundItem result = Item.MatchingFoundItemInfo(word, Founditem);
        assertEquals(expResult, result);
    }

    /**
     * Test of displayMatchingFoundItemInfo method, of class Item.
     */
    @Ignore
    public void testDisplayMatchingFoundItemInfo() {
        System.out.println("displayMatchingFoundItemInfo");
        FoundItem foundItem = null;
        Item.displayMatchingFoundItemInfo(foundItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparePhoto method, of class Item.
     */
    @Ignore
    public void testComparePhoto() {
        System.out.println("comparePhoto");
        Item instance = null;
        instance.comparePhoto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
