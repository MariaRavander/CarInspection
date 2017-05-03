package se.kth.iv1350.carInspection.controller;


import java.util.List;
import se.kth.iv1350.carInspection.model.*;
import se.kth.iv1350.carInspection.creditCard.CreditCard;
import se.kth.iv1350.carInspection.integration.*;

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
     * @param printer The printer that prints all documents.
     * @param databaseManager The database manager used for all database calls.
     * @param creditCardReader The credit card reader used for all card transactions.
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
     * Ask to open garage door.     
     */

    public void openGarageDoor(){

        garage.openDoor();

    }

    /**
     * Ask to close garage door.
     */

    public void closeGarageDoor(){

        garage.closeDoor();

    }


    /**
     * Asks to calculate the total cost for this inspection.
     * @param regNo The registration number for the specified vehicle.
     * @return cost The total cost.
     */	


    public Amount askForCostByRegNo(String regNo){

        inspection = new Inspection(regNo, databaseManager, printer);

        return inspection.calculateCost();          
    
    }

        
    /**
     * Asks to make a new card, makes the transaction and asks for pint out.
     * @param cost The total cost of the inspection.
     * @param pin The pin number of the credit card.
     */

    public void cardPayment(Amount cost, int pin){

    	CreditCard card = creditCardReader.createCreditCard(pin);
        boolean approvement = creditCardReader.cardTransaction(cost, card);
        creditCardReader.printCardReceipt(approvement, card, cost);

     }
        
    /**
      * Request the inspection list for this vehicle.
      * @return the inspection list.
      */     

    public List<InspectionItem> requestInspections(){

        List<InspectionItem> inspectionList = inspection.getInspectionList();

        return inspectionList;

    }

    /**
     * Forwards the updated inspection result for this part of the inspection
     * @param inspectionResult The inspection result.
     * @param checklistIndex The specified row of the inspection list.
     */     
    
    public void enterResult(String inspectionResult, int checklistIndex){

        inspection.inspectionResult.handleInspectionResult(inspectionResult, checklistIndex);

        }
}