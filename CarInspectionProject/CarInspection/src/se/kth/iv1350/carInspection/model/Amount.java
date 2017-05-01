package se.kth.iv1350.carInspection.model;

import se.kth.iv1350.carInspection.integration.InspectionChecklist;

/**
 * This class represents an amount.
 */

public class Amount {
	
	private final int value;

	/**
	 * Creates a new instance which uses a value and sets it as an <code>Amount</code>-type
	 * @param value The value that should be converted to an amount.
	 */
	
	public Amount(int value){
		this.value = value;
	}
	
	
	/**
	 * 
	 * @return an <code>Amount</code>.
	 */
	public int getAmount(){
		return value;
	}
        
        @Override
	   public boolean equals(Object other) {
	       if (other == null) {
	           return false;
	       }
	       if (!(other instanceof Amount)) {
	           return false;
	       }
	       Amount otherInspItem = (Amount)other;
               
	       return otherInspItem.value == this.value;
	   }
}
