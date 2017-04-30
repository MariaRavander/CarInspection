package view;

import model.Amount;
import controller.Controller;
import integration.*;

/**
 * 
 * This program has no view, instead this class is a placeholder
 * for the entire view.
 *
 */
public class View {
	
	private Controller controller;
	
    /**
     * Creates a new instance that will use the specified controller for all system operations.
     * 
     * @param controller The controller to use for system operations.
     */
	
	public View(Controller controller) {
		this.controller = controller;
	}

	
    /**
     * Calls all system operations and prints the result to <code>System.out</code>.
     */
	
	public void start()	{
		
		String regNo = "ABC123";
		controller.callInNextCustomer();
		Amount cost = controller.enterRegNo(regNo);
		System.out.println("The total cost is: " + cost.getAmount());
	}
}
