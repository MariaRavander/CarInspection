package se.kth.iv1350.carInspection.model;

import se.kth.iv1350.carInspection.integration.*;
import java.util.*;

/**
 * Represents the results of an inspection.
 *
 */

public class InspectionResult {
    
    private String regNo;
    private List<InspectionChecklist> inspectionList;
    private DatabaseManager databaseManager;
    private Printer printer;
    
	
	/**
	 * Creates a new instance using the registration number and the scheduled inspections for 
	 * the specified vehicle 
	 * @param regNo The registration number for the specified vehicle.
	 * @param inspectionList The list of inspections to do.
	 */
	
	public InspectionResult(String regNo, List<InspectionChecklist> inspectionList, DatabaseManager databaseManager, Printer printer){
            this.regNo = regNo;
            this.inspectionList = inspectionList;
            this.databaseManager = databaseManager;
            this.printer = printer;
	}


        public void addInspectionResult(String passedInspection, int checklistIndex){
            
            databaseManager.saveInspectionResult(passedInspection, checklistIndex);
            if(checklistIndex == inspectionList.size()-1){
                String result = this.toString();
                printer.printInspectionResult(result);
            }
           
        }
        
        public String toString(){
            StringBuilder result = new StringBuilder ("Registration number: " + regNo);
            for(int i=0; i<inspectionList.size(); i++)
                result.append("\n" + this.inspectionList.get(i).getVehiclePart() + "  " + this.inspectionList.get(i).getPassedInspection());
                
            return result.toString();
        }
}
