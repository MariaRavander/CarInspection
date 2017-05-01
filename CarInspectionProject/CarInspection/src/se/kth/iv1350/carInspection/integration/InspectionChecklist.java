package se.kth.iv1350.carInspection.integration;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.carInspection.model.Amount;

/**
 * Represents an particular control of a vehicle and it's cost.
 */
public class InspectionChecklist {
	private String vehiclePart;
	private int cost;
        private String passedInspection;
	
     /**
     * Creates new instance representing the specified control.
     * 
     * @param vehiclePart The specific vehicle part of this control.
     * @param cost The cost of this control.
     */
	
	public InspectionChecklist (String vehiclePart, int cost, String passedInspection){
		this.vehiclePart = vehiclePart;
		this.cost = cost;
                this.passedInspection = passedInspection;
	}
	
	/**
	 * 
	 * @return The vehicle part that should be inspected
	 */
	
	public String getVehiclePart(){
		return vehiclePart;
	}
	
    /**
     * @return The cost of this control.
     */
	public int getCost(){
		return cost;
	}
        
        public String getPassedInspection(){
		return passedInspection;
	}
        
        public void updateResult(String passInspection){
            this.passedInspection = passInspection;
        }
	
	
	  /**
	    * @return True if the specified object is considered to represent the same inspection item as
	    *         this object.
	    */
	   @Override
	   public boolean equals(Object other) {
	       if (other == null) {
	           return false;
	       }
	       if (!(other instanceof InspectionChecklist)) {
	           return false;
	       }
	       InspectionChecklist otherInspItem = (InspectionChecklist) other;
	       return otherInspItem.cost == this.cost && otherInspItem.vehiclePart == this.vehiclePart;
	   }
}
