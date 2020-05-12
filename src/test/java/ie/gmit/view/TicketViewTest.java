package ie.gmit.view;

import ie.gmit.contract.TicketContract;
import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;
import ie.gmit.view.component.MockInputManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TicketViewTest {

    private TicketView view;
    private MockPresenter presenter;
    private MockInputManager inputManager;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        presenter = new MockPresenter();
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        inputManager = new MockInputManager(printStream);
        view = new TicketView(inputManager, printStream, presenter);
    }

    @Test
    public void test_start_should_attachOnPresenter() {
        view.start();

        assertEquals(view, presenter.view);
    }

    static class MockPresenter implements TicketContract.Presenter {

        Country lastCountry;

        @Override
        public void chooseCountry(Country country) {
            this.lastCountry = country;
        }

        Ticket lastTicket;

        @Override
        public void chooseTicket(Ticket ticket) {
            this.lastTicket = ticket;
        }

        Order lastOrder;

        @Override
        public void placeOrder(Order order) {
            this.lastOrder = order;
        }

        Order lastConfirm;

        @Override
        public void confirmOrder(Order order) {
            this.lastConfirm = order;
        }

        TicketContract.View view;

        @Override
        public void attach(TicketContract.View view) {
            this.view = view;
        }
    }

}