package ie.gmit.presenter;

import ie.gmit.contract.TicketContract;
import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;
import ie.gmit.repository.LocalDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketPresenterTest {

    private TicketPresenter presenter;
    private MockView view;
    private MockDatabase database;

    @BeforeEach
    public void setup() {
        database = new MockDatabase();
        presenter = new TicketPresenter(database);
        view = new MockView();
    }

    @Test
    public void test_attachView_should_callCountryMenuInView_fromDatabaseCountryList() {
        ArrayList<Country> countries = new ArrayList<>();
        Country saudi = new Country("Saudi Arabia");
        countries.add(saudi);
        database.countries = countries;

        presenter.attach(view);

        assertEquals(1, view.lastCountries.size());
        assertEquals(saudi, view.lastCountries.get(0));
    }

    static class MockView implements TicketContract.View {

        List<Country> lastCountries;

        @Override
        public void countryMenu(List<Country> countries) {
            this.lastCountries = countries;
        }

        Country lastTicketCountry;
        List<Ticket> lastTickets;

        @Override
        public void ticketMenu(Country country, List<Ticket> tickets) {
            this.lastTicketCountry = country;
            this.lastTickets = tickets;
        }

        Ticket lastQuantityTicket;

        @Override
        public void quantityMenu(Ticket ticket) {
            this.lastQuantityTicket = ticket;
        }

        List<Order> lastOrders;
        Order lastOrder;

        @Override
        public void orderMenu(List<Order> orders, Order order) {
            this.lastOrder = order;
            this.lastOrders = orders;
        }

        int startCount = 0;

        @Override
        public void start() {
            startCount++;
        }
    }

    static class MockDatabase implements LocalDatabase {

        List<Country> countries;

        @Override
        public List<Country> getCountries() {
            return countries;
        }

        List<Ticket> tickets;
        Country lastCountry;

        @Override
        public List<Ticket> getTickets(Country country) {
            this.lastCountry = country;
            return tickets;
        }

        Order lastOrder;

        @Override
        public void saveOrder(Order order) {
            this.lastOrder = order;
        }

        List<Order> orders;

        @Override
        public List<Order> getOrders() {
            return orders;
        }
    }
}