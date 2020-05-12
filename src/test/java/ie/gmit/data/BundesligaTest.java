package ie.gmit.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BundesligaTest {
    private Bundesliga Bliga;

    @BeforeEach
    private void setup() {
        Bliga = new Bundesliga();
    }

    @Test
    public void test() {
        String code = "this is a cat";

        assertNotEquals(code, Bliga.getTicketCode());

        Bliga.setTicketCode(code);

        assertEquals(code, Bliga.getTicketCode());
    }
    @Test
    public void matchTest() {
        String code = "Test String";

        assertNotEquals(code, Bliga.getMatch());

        Bliga.setMatch(code);

        assertEquals(code, Bliga.getMatch());
    }
    @Test
    public void dateTest() {
        String code = "Test String";

        assertNotEquals(code, Bliga.getDate());

        Bliga.setDate(code);

        assertEquals(code, Bliga.getDate());
    }
    @Test
    public void locationTest() {
        String code = "Test String";

        assertNotEquals(code, Bliga.getLocation());

        Bliga.setLocation(code);

        assertEquals(code, Bliga.getLocation());
    }
    @Test
    public void seatTest() {
        String code = "Test String";

        assertNotEquals(code, Bliga.getSeatNumber());

        Bliga.setSeatNumber(code);

        assertEquals(code, Bliga.getSeatNumber());
    }
    @Test
    public void ticketTest() {
        String code = "Test String";

        assertNotEquals(code, Bliga.getTicketNumber());

        Bliga.setTicketNumber(code);

        assertEquals(code, Bliga.getTicketNumber());
    }
    @Test
    public void priceTest() {
        double code = 5.0;

        assertNotEquals(code, Bliga.getPrice());

        Bliga.setPrice(code);

        assertEquals(code, Bliga.getPrice());
    }
}
