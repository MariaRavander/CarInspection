package se.kth.iv1350.carInspection.startup;



import se.kth.iv1350.carInspection.view.View;

import se.kth.iv1350.carInspection.integration.DatabaseManager;

import se.kth.iv1350.carInspection.integration.Printer;

import se.kth.iv1350.carInspection.integration.CreditCardReader;

import se.kth.iv1350.carInspection.controller.Controller;



/**

 * Starts the application.

 */

public class Main {



	

	/**

	 * This is the application's main method, which start the entire car inspection system.

	 * 

	 * @param args There are no command line parameters.

	 */	

	public static void main(String [] args){

		DatabaseManager databaseManager = new DatabaseManager();

		Printer printer = new Printer();

		CreditCardReader creditCardReader = new CreditCardReader(printer);

		Controller controller = new Controller(printer, databaseManager, creditCardReader);

		View view = new View(controller);

		view.start();

	}

}