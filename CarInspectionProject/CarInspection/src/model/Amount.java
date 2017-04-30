package model;

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
}
