package se.kth.iv1350.carInspection.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for database calls. This is the only place the database is called.
 */

public class DatabaseManager {

    private List<InspectionItem> inspectionList;

    /**
     * Creates a new instance, which uses a hard coded list of inspections instead of calling a
     * database.
     */	

    public DatabaseManager(){
        
        createInspections();

    }

    /**
     * Searches the database for inspections to be performed on the specified vehicle. This dummy
     * implementation return the same, hard coded, inspections for all vehicles.
     * 
     * @param regNo The vehicle with this registration number that should be inspected.
     * @return A list of <code>InspectionChecklist</code>s, where each element describes one particular
     *         control.
     */	

    public List<InspectionItem> getInspections(String regNo){

        return inspectionList;

    }

    /**
     * The hard coded inspection list
     */	

    private void createInspections(){

        inspectionList = new ArrayList<>();
	inspectionList.add(new InspectionItem("Brakes", 105, "Failed"));
	inspectionList.add(new InspectionItem("Engine", 65, "Failed"));
	inspectionList.add(new InspectionItem("Lights", 25, "Failed"));

    }

    /**
     * Asks to save the inspection result for the specific inspection in the list.
     * @param inspectionResult The inspection result.
     * @param checklistIndex The row in the specified insection list.
     */

    public void saveInspectionResult(String inspectionResult, int checklistIndex){

        inspectionList.get(checklistIndex).updateResult(inspectionResult);    
        
    }

}