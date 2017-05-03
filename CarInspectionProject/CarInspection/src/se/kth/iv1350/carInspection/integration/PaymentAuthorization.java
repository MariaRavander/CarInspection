package se.kth.iv1350.carInspection.integration;



import se.kth.iv1350.carInspection.creditCard.CreditCard;

import se.kth.iv1350.carInspection.model.*;



/**

 * Handles all communication with the payment authorization system.

 */

class PaymentAuthorization {



    /**

     * Requests authorization for the specified payment.

     *

     * @param card   The card used for the payment.

     * @param amount The amount to pay.

     * @return <code>true</code> if the payment is authorized,

     *         <code>false</code> if it is not. This dummy implementation always

     *         returns <code>true</code>.

     */

    boolean authorizePayment(CreditCard card, Amount amount) {

        return true;

    }

}