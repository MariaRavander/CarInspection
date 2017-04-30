package se.kth.iv1350.carInspection.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for database calls. This is the only place the database is called.
 */

public class DatabaseManager {
	
	private List<InspectionChecklist> inspectionList;

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
	
	public List<InspectionChecklist> getInspections(String regNo){
		return inspectionList;
	}
	
	/**
	 * The hard coded inspection list
	 */
	
	private void createInspections(){
		inspectionList = new ArrayList<>();
		inspectionList.add(new InspectionChecklist("Brakes", 105));
		inspectionList.add(new InspectionChecklist("Engine", 65));
		inspectionList.add(new InspectionChecklist("Lights", 25));
		/*for(int i = 0; i < inspectionList.size(); i++)
		{
			System.out.println(inspectionList.get(i));
		}*/
	}
}
