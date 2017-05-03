package se.kth.iv1350.carInspection.model;



import se.kth.iv1350.carInspection.integration.*;

import java.util.*;



/**

 * Represents the results of an inspection.

 *

 */



public class InspectionResult {

    

    private String regNo;

    private List<InspectionItem> inspectionList;

    private DatabaseManager databaseManager;

    private Printer printer;

    

	

	/**

	 * Creates a new instance using the registration number and the scheduled inspections for 

	 * the specified vehicle 

	 * @param regNo The registration number for the specified vehicle.

	 * @param inspectionList The list of inspections to do.

	 * @param databaseManager The database manager that handles the communication with the database.

	 */	

	InspectionResult(String regNo, List<InspectionItem> inspectionList, DatabaseManager databaseManager, Printer printer){

		this.regNo = regNo;

		this.inspectionList = inspectionList;

		this.databaseManager = databaseManager;

		this.printer = printer;

	}





	/**

	 * Asks to add the inspection result for the inspection item and asks for print out.

	 * @param passedInspection

	 * @param checklistIndex

	 */

	public void handleInspectionResult(String passedInspection, int checklistIndex){            

		int noOfInspections = inspectionList.size()-1;

		databaseManager.saveInspectionResult(passedInspection, checklistIndex);

			if(checklistIndex == noOfInspections){

                String result = this.toString();

                printer.printInspectionResult(result);

            }           

	}



	

	/**

	 * Converts the inspection result to a string.

	 * @return the result as a string.

	 */

	public String toString(){

		StringBuilder result = new StringBuilder ("Registration number: " + regNo);

		for(int i=0; i<inspectionList.size(); i++)

			result.append("\n" + this.inspectionList.get(i).getVehiclePart() + "  " + this.inspectionList.get(i).getInspectionResult());                

            return result.toString();

        }      

}