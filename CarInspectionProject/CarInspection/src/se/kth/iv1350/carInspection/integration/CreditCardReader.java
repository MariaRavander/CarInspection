package se.kth.iv1350.carInspection.integration;

import java.time.YearMonth;
import se.kth.iv1350.carInspection.model.*;
import se.kth.iv1350.carInspection.creditCard.*;
import se.kth.iv1350.carInspection.integration.*;

/**
 * Represents a credit card reader.
 *nmnb
 */

public class CreditCardReader {
	private Printer printer;
	/**
	 * Creates a new instance.
	 */
    
	public CreditCardReader(Printer printer){
            this.printer = printer;
		
	}
        
        public void cardTransaction(Amount cost, int pin){
            String number = "123456789";
            String holder = "Anders Johansson";
            YearMonth expiryDate = YearMonth.of(2019, 12);
            int cvc = 353;
            
            CreditCard card = new CreditCard(pin, number, holder, expiryDate, cvc);
            
            boolean approvment = PaymentAuthorization.authorizePayment(card, cost);
            
            Receipt receipt = new Receipt(approvment, card, cost);
            printer.printReceipt(receipt);
            
            
           
        }

}
