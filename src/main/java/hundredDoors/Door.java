package hundredDoors;

public class Door {
    private static final int CLOSED = 0;
    private static final int OPEN = 1;

    private int statusOfDoorOpening;

    public Door(){
        statusOfDoorOpening = CLOSED;
    }

    public void toggle(){
       if (statusOfDoorOpening == OPEN) statusOfDoorOpening = CLOSED;
       else statusOfDoorOpening = OPEN;
    }

    public boolean isOpened(){
        return statusOfDoorOpening == OPEN;
    }

}
