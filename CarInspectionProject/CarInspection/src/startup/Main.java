package startup;

import controller.Controller;
import view.*;
import integration.*;
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
		CreditCardReader creditCardReader = new CreditCardReader();
		Controller controller = new Controller(printer, databaseManager);
		View view = new View(controller);
		view.start();
	}

}
