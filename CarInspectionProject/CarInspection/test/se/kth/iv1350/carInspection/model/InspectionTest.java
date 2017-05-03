
package se.kth.iv1350.carInspection.model;

import se.kth.iv1350.carInspection.integration.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class InspectionTest {

    private DatabaseManager databaseManager;

    private Printer printer;

    

    @Before

    public void setUp() {

        databaseManager = new DatabaseManager();
        printer = new Printer();

    }

    @After

    public void tearDown() {

        databaseManager = null;
        printer = null;

    }

    /**
     * Test of calculateCost method, of class Inspection.
     */

    @Test

    public void testCalculateCost() {

        String regNo = "ABC123";
        Inspection instance = new Inspection(regNo, databaseManager, printer);
        Amount expResult = new Amount(195);
        Amount result = instance.calculateCost();
        assertEquals("Calculated cost is incorrect", expResult, result);      

    }    

}
