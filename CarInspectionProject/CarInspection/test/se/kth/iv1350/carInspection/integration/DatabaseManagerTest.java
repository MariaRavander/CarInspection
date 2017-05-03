package se.kth.iv1350.carInspection.integration;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DatabaseManagerTest {

    private DatabaseManager databaseManager;
    private List<InspectionItem> inspectionList;


    @Before

    public void setUp() {

       databaseManager = new DatabaseManager();

    }

    @After

    public void tearDown() {

       databaseManager = null;

    }

    @Test

    public void testNumberOfFoundInspections() {
       
        int expResult = 3;
        int result = databaseManager.getInspections("ABC123").size();
        assertEquals("Wrong number of inspection items", expResult, result);

    }

    @Test

    public void testCorrectInspectionList() {

        List<InspectionItem> expResult = new ArrayList<>();
        expResult.add(new InspectionItem("Brakes", 105, "Failed"));
        expResult.add(new InspectionItem("Engine", 65, "Failed"));
        expResult.add(new InspectionItem("Lights", 25, "Failed"));

        String regNo = "ABC123";
        List<InspectionItem> inspectionList = databaseManager.getInspections(regNo);

        for (int i = 0; i < expResult.size(); i++) {

           assertEquals("Wrong inspection list: ", expResult.get(i), inspectionList.get(i));

        }

    }

}