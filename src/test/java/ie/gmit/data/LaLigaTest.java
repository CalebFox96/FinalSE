package ie.gmit.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LaLigaTest {
    private LaLiga laliga;

    @BeforeEach
    private void setup() {
        laliga = new LaLiga();
    }

    @Test
    public void test() {
        String code = "this is a cat";

        assertNotEquals(code, laliga.getTicketCode());

        laliga.setTicketCode(code);

        assertEquals(code, laliga.getTicketCode());
    }
    @Test
    public void matchTest() {
        String code = "Test String";

        assertNotEquals(code, laliga.getMatch());

        laliga.setMatch(code);

        assertEquals(code, laliga.getMatch());
    }
    @Test
    public void dateTest() {
        String code = "Test String";

        assertNotEquals(code, laliga.getDate());

        laliga.setDate(code);

        assertEquals(code, laliga.getDate());
    }
    @Test
    public void locationTest() {
        String code = "Test String";

        assertNotEquals(code, laliga.getLocation());

        laliga.setLocation(code);

        assertEquals(code, laliga.getLocation());
    }
    @Test
    public void seatTest() {
        String code = "Test String";

        assertNotEquals(code, laliga.getSeatNumber());

        laliga.setSeatNumber(code);

        assertEquals(code, laliga.getSeatNumber());
    }
    @Test
    public void ticketTest() {
        String code = "Test String";

        assertNotEquals(code, laliga.getTicketNumber());

        laliga.setTicketNumber(code);

        assertEquals(code, laliga.getTicketNumber());
    }
    @Test
    public void priceTest() {
        double code = 5.0;

        assertNotEquals(code, laliga.getPrice());

        laliga.setPrice(code);

        assertEquals(code, laliga.getPrice());
    }
}
