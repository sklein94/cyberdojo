package hundredDoors;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    @Test
    public void checkShouldBeOpen() {
        assertTrue(Room.getDoorStatus(1, 100));
        assertFalse(Room.getDoorStatus(2, 100));
        assertFalse(Room.getDoorStatus(3, 100));
        assertTrue(Room.getDoorStatus(100, 100));
    }
}