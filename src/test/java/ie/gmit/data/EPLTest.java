package ie.gmit.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EPLTest {

    private Ticket epl;

    @BeforeEach
    private void setup() {
        epl = new Ticket();
    }

    @Test
    public void test() {
        String code = "this is a cat";

        assertNotEquals(code, epl.getTicketCode());

        epl.setTicketCode(code);

        assertEquals(code, epl.getTicketCode());
    }
    @Test
    public void matchTest() {
        String code = "Test String";

        assertNotEquals(code, epl.getMatch());

        epl.setMatch(code);

       assertEquals(code, epl.getMatch());
    }
    @Test
    public void dateTest() {
        String code = "Test String";

        assertNotEquals(code, epl.getDate());

        epl.setDate(code);

        assertEquals(code, epl.getDate());
    }
    @Test
    public void locationTest() {
        String code = "Test String";

        assertNotEquals(code, epl.getLocation());

        epl.setLocation(code);

        assertEquals(code, epl.getLocation());
    }
    @Test
    public void seatTest() {
        String code = "Test String";

        assertNotEquals(code, epl.getSeatNumber());

        epl.setSeatNumber(code);

        assertEquals(code, epl.getSeatNumber());
    }
    @Test
    public void ticketTest() {
        String code = "Test String";

        assertNotEquals(code, epl.getTicketNumber());

        epl.setTicketNumber(code);

        assertEquals(code, epl.getTicketNumber());
    }
    @Test
    public void priceTest() {
        double code = 5.0;

        assertNotEquals(code, epl.getPrice());

        epl.setPrice(code);

        assertEquals(code, epl.getPrice());
    }

}