package se.kth.iv1350.carInspection.controller;

import java.util.List;
import se.kth.iv1350.carInspection.model.*;
import se.kth.iv1350.carInspection.integration.*;
import se.kth.iv1350.carInspection.startup.*;


/**
 * 
 * This is the application's only controller class.
 * All calls to the model pass through here.
 *
 */

public class Controller {
	
	private Printer printer;
	private DatabaseManager databaseManager;	
	private Garage garage = new Garage();
        private CreditCardReader creditCardReader;
        private Inspection inspection;
	
	/**
	 * Creates a new instance using the specified database manager.
	 * 
	 * @param printer The printer that prints all documents.
	 * @param databaseManager The database manager used for all database calls.
	 */
	
	public Controller(Printer printer, DatabaseManager databaseManager, CreditCardReader creditCardReader) {
		this.printer = printer;
		this.databaseManager = databaseManager;
                this.creditCardReader = creditCardReader;
		
	}
	
	
	/**
	 * This method calls methods in the garage class to call in the next customer.
	 */
	
	public void callInNextCustomer(){
		garage.nextCustomer();
		garage.closeDoor();
	}
	
	/**
	 * Asks to calculate the total cost for this inspection.
	 * @param regNo The registration number for the specified vehicle.
	 * @return the total cost.
	 */
	
	public Amount enterRegNo(String regNo){
		inspection = new Inspection(regNo, databaseManager, printer);
		
		return inspection.calculateCost();
                
	}
        
        public void cardPayment(Amount cost, int pin){
            creditCardReader.cardTransaction(cost, pin);
        }
        
        public List<InspectionChecklist> requestNextInspection(){
        
            List<InspectionChecklist> inspectionList = inspection.getInspections();
            
            return inspectionList;
        }
        
        public void enterResult(String passedInspection, int checklistIndex){
            inspection.inspectionResult.addInspectionResult(passedInspection, checklistIndex);
        }
}
