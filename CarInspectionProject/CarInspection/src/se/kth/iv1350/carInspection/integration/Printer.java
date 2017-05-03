package se.kth.iv1350.carInspection.integration;



import se.kth.iv1350.carInspection.model.*;



/**

 * Represents a printer.

 *

 */

public class Printer {



	/**

	 * Creates a new instance of a printer.

	 */	

	public Printer(){		

	}

        

	

	/**

	 * Print the card receipt.

	 * @param receipt The receipt.

	 */

	public void printReceipt(Receipt receipt){

		System.out.println("\nRECEIPT PRINTOUT: " + receipt.toString());

	}

       

	

	/**

	* Prints the inspection result.

	* @param inspectionResult The inspection result.

	*/

	public void printInspectionResult(String inspectionResult){

		System.out.println("\nINSPECTION RESULT PRINTOUT: \n" + inspectionResult.toString());

	}        

}