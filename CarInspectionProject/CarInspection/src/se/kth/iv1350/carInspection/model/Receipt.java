
package se.kth.iv1350.carInspection.model;

import se.kth.iv1350.carInspection.creditCard.CreditCard;

/**
 *
 * @author maria
 */
public class Receipt {

    private boolean approvment;
    private CreditCard card;
    private Amount cost;
    
    public Receipt(boolean approvment, CreditCard card, Amount cost) {
        this.approvment = approvment;
        this.card = card;
        this.cost = cost;
             
    }
    
    public boolean getApprovment(){
       return approvment;
    }
    
    public CreditCard getCard(){
       return card;
    }
    
    public Amount getCost(){
       return cost;
    }
    
    
    public String toString(){
        return "\nApproved: " + this.approvment +
               "\nCreditcard number: " + card.getNumber() +
               "\nCost: " + this.cost.getAmount();
      }
}
        