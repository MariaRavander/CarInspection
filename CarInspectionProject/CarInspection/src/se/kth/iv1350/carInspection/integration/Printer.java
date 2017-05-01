package se.kth.iv1350.carInspection.integration;

import se.kth.iv1350.carInspection.model.*;

/**
 * Represents a printer.
 * @author nathaliehedin
 *
 */

public class Printer {

	/**
	 * Creates a new instance.
	 */
	
	public Printer(){
		
	}
        
        public void printReceipt(Receipt receipt){
            
            System.out.println("\nRECEIPT PRINTOUT: " + receipt.toString());
        }
        
        public void printInspectionResult(String inspectionResult){
            System.out.println("\nINSPECTION RESULT PRINTOUT: \n" + inspectionResult.toString());
        }
        
}
