package se.kth.iv1350.carInspection.integration;



import java.time.YearMonth;

import se.kth.iv1350.carInspection.model.*;

import se.kth.iv1350.carInspection.creditCard.*;

import se.kth.iv1350.carInspection.integration.*;



/**

 * Represents a credit card reader.

 */



public class CreditCardReader {

	

	private Printer printer;

	private PaymentAuthorization paymentAuthorization;

	

	

	/**

	 * Creates a new instance of a credit card reader.

	 */

	public CreditCardReader(Printer printer){

		this.printer = printer;

		this.paymentAuthorization = new PaymentAuthorization();

	}

        

	

	/**

	 * Creates a new hard coded credit card.

	 * @param pin The pin number of the credit card.

	 */

	public CreditCard createCreditCard(int pin){

		String number = "123456789";

        String holder = "Anders Johansson";

        YearMonth expiryDate = YearMonth.of(2019, 12);

        int cvc = 353;

            

        CreditCard card = new CreditCard(pin, number, holder, expiryDate, cvc);

        return card;

	}

	

	

	/**

	 * Makes the card transaction and returns the approvment.

	 * @param cost The total cost for this inspection.

	 * @param card The credit card.

	 * @return the approvment.

	 */

	public boolean cardTransaction(Amount cost, CreditCard card){      

		boolean approvement = paymentAuthorization.authorizePayment(card, cost);

        return approvement;  

    }

	

	

	/**

	 * Creates the credit card receipt and asks for printout.

	 * @param approvement The approvement of the credit card.

	 * @param card The credit card.

	 * @param cost The total cost for this specific inspection.

	 */

	public void printCardReceipt(boolean approvement, CreditCard card, Amount cost){

        Receipt receipt = new Receipt(approvement, card, cost);

        printer.printReceipt(receipt); 

	}

}