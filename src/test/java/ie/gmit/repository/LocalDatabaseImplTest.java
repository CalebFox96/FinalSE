package ie.gmit.repository;

import ie.gmit.data.Country;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalDatabaseImplTest {

    private LocalDatabaseImpl database;

    @BeforeEach
    void setup() {
        database = new LocalDatabaseImpl();
    }

    @Test
    void testGetCountries_shouldReturns_4Countries() {
        List<Country> countries = database.getCountries();

        assertEquals(4, countries.size());
    }
}