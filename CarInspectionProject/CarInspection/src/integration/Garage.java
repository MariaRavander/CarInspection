package integration;

/**
 * This is a facade to the hardware of the GARAGE, namely the door and the queue
 * number display on the outside wall. 
 * @contributor Leif L.
 */
public class Garage {
    private Door door = new Door();
    private Display display = new Display();

    /**
     * Creates an instance and connects to the door and queue number display.
     */
    public Garage() {
    }

    /**
     * Opens the door and displays the next queue number.
     */
    public void nextCustomer() {
        door.open();
        display.nextNumber();
    }

    /**
     * Closes the door
     */
    public void closeDoor() {
        door.close();
    }

}
