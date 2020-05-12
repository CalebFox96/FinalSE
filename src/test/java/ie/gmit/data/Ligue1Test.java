package ie.gmit.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Ligue1Test {

    private Ligue1 ligue1;

    @BeforeEach
    private void setup() {
        ligue1 = new Ligue1();
    }

    @Test
    public void test() {
        String code = "this is a cat";

        assertNotEquals(code, ligue1.getTicketCode());

        ligue1.setTicketCode(code);

        assertEquals(code, ligue1.getTicketCode());
    }
    @Test
    public void matchTest() {
        String code = "Test String";

        assertNotEquals(code, ligue1.getMatch());

        ligue1.setMatch(code);

        assertEquals(code, ligue1.getMatch());
    }
    @Test
    public void dateTest() {
        String code = "Test String";

        assertNotEquals(code, ligue1.getDate());

        ligue1.setDate(code);

        assertEquals(code, ligue1.getDate());
    }
    @Test
    public void locationTest() {
        String code = "Test String";

        assertNotEquals(code, ligue1.getLocation());

        ligue1.setLocation(code);

        assertEquals(code, ligue1.getLocation());
    }
    @Test
    public void seatTest() {
        String code = "Test String";

        assertNotEquals(code, ligue1.getSeatNumber());

        ligue1.setSeatNumber(code);

        assertEquals(code, ligue1.getSeatNumber());
    }
    @Test
    public void ticketTest() {
        String code = "Test String";

        assertNotEquals(code, ligue1.getTicketNumber());

        ligue1.setTicketNumber(code);

        assertEquals(code, ligue1.getTicketNumber());
    }
    @Test
    public void priceTest() {
        double code = 5.0;

        assertNotEquals(code, ligue1.getPrice());

        ligue1.setPrice(code);

        assertEquals(code, ligue1.getPrice());
    }
}
