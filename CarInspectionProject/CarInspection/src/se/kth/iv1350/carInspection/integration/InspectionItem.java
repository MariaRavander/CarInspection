package se.kth.iv1350.carInspection.integration;

/**
 * Represents an particular control of a vehicle and it's cost.
 */

public class InspectionItem {

    private String vehiclePart;
    private int cost;
    private String inspectionResult;
    
    /**
     * Creates new instance representing the specified control.
     * @param vehiclePart The specific vehicle part of this control.
     * @param cost The cost of this control.
     * @param inspectionResult The inspection result.
     */

    public InspectionItem (String vehiclePart, int cost, String inspectionResult){

        this.vehiclePart = vehiclePart;
	this.cost = cost;
        this.inspectionResult = inspectionResult;
    
    }
    
    /**
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
	
    /**
     * @return The inspection result.
     */

    public String getInspectionResult(){

        return inspectionResult;

    }
    
    /**
     * Updates the inspection result.
     * @param updatedInspectionResult The inspection result.
     */

    public void updateResult(String updatedInspectionResult){

        this.inspectionResult = updatedInspectionResult;

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
        
	if (!(other instanceof InspectionItem)) {

            return false;

	}

        InspectionItem otherInspItem = (InspectionItem) other;

	return otherInspItem.cost == this.cost && otherInspItem.vehiclePart == this.vehiclePart;
    
    }

}