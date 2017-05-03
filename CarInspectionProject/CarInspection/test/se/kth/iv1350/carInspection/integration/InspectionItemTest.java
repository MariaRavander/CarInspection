
package se.kth.iv1350.carInspection.integration;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class InspectionItemTest {


    @Before

    public void setUp() throws Exception {

    }

    @After

    public void tearDown() throws Exception {
	
    }
        
    @Test

    public void testUpdateInspectionResult() {

        InspectionItem expResult = new InspectionItem("Brakes", 105, "InspectionResult");
        InspectionItem testResult = new InspectionItem("Brakes", 105, "Failed");
	testResult.updateResult("InspectionResult");
	assertEquals("Inspection result was not updated", expResult, testResult);

    }
	
    @Test
 
    public void testUpdateNullResult() {
        InspectionItem expResult = new InspectionItem("Brakes", 105, null);
	InspectionItem testResult = new InspectionItem("Brakes", 105, "Failed");
        testResult.updateResult(null);
	assertEquals("Inspection result was null", expResult, testResult);
        
    }
}