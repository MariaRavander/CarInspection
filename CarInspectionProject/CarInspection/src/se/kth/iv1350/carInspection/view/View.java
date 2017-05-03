package se.kth.iv1350.carInspection.view;



import java.util.List;

import se.kth.iv1350.carInspection.model.Amount;

import se.kth.iv1350.carInspection.controller.Controller;

import se.kth.iv1350.carInspection.integration.*;



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

        String passedInspection = "passed";

        int checklistIndex;

		String regNo = "ABC123";

		int pin = 1234;

		

		controller.callInNextCustomer();

		Amount cost = controller.askForCostByRegNo(regNo);

		System.out.println("Screeen output: \nThe total cost is: " + cost.getAmount());   

        controller.cardPayment(cost, pin);

        List <InspectionItem> inspections = controller.requestInspections();

        System.out.println("\nScreen output:");

        for(int i=0; i<inspections.size(); i++){

    		checklistIndex = i;

        	System.out.print("Screen output: Inspection " + (i+1) + ": " + inspections.get(i).getVehiclePart() + "\n*Interacts* Inspector enters inspection result.\n");

            controller.enterResult(passedInspection, checklistIndex);

        }        

        controller.openGarageDoor();

        controller.closeGarageDoor();

	}

}