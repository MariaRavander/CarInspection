
package se.kth.iv1350.carInspection.model;

import se.kth.iv1350.carInspection.creditCard.CreditCard;

/**
 * Represents a receipt of the inspection.
 */

public class Receipt {

    private boolean approvment;
    private CreditCard card;
    private Amount cost;

    /**
     * Creates a new instance of a receipt.
     * @param approvment The approvement of the card transaction.
     * @param card The credit card.
     * @param cost The total cost of the inspection.
     */

    public Receipt(boolean approvment, CreditCard card, Amount cost) {

        this.approvment = approvment;
        this.card = card;
        this.cost = cost;            

    }
    
    /**
     * @return The approvement of the card transaction.
     */

    public boolean getApprovment(){

       return approvment;

    }

    /**
     * @return The credit card.
     */

    public CreditCard getCard(){

       return card;

    }

    /**
     * @return The total cost of the inspection.
     */

    public Amount getCost(){

       return cost;

    }

    /**
     * @return the receipt as a string.
     */

    public String toString(){

        return "\nApproved: " + this.approvment +
               "\nCreditcard number: " + card.getNumber() +
               "\nCost: " + this.cost.getAmount();

	}

}