package controller;

import integration.*;
import model.*;

/**
 * knkn
 * This is the application's only controller class.
 * All calls to the model pass through here.
 *
 */

public class Controller {
	
	private Printer printer;
	private DatabaseManager databaseManager;	
	Garage garage = new Garage();
	
	/**
	 * Creates a new instance using the specified database manager.
	 * 
	 * @param printer The printer that prints all documents.
	 * @param databaseManager The database manager used for all database calls.
	 */
	
	public Controller(Printer printer, DatabaseManager databaseManager) {
		this.printer = printer;
		this.databaseManager = databaseManager;
		
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
		Inspection inspection = new Inspection(regNo, databaseManager, printer);
		
		return inspection.calculateCost();
	}
}
