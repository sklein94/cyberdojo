package hundredDoors;

public class Room {
    private Room() {
    }

    public static void printDoorStatiAfterTheseRuns(int runs) {
        for (int i = 1; i <= 100; i++) {
            if (getDoorStatus(i, 100)) System.out.println("Die Tür " + i + " ist geoeffnet.");
            if (!getDoorStatus(i, 100)) System.out.println("Die Tür " + i + " ist geschlossen.");
        }
    }

    public static boolean getDoorStatus(int doorNumber, int runs) {
        Door d = new Door();
        if (doorNumber > 0 && doorNumber <= 100 && runs > 0 && runs <= 100) {
            for (int i = 1; i <= runs; i++) {
                if ((doorNumber % i) == 0) d.toggle();
            }
        }
        return d.isOpened();
    }



}
