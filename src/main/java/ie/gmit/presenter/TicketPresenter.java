package ie.gmit.presenter;

import ie.gmit.contract.TicketContract;
import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;
import ie.gmit.repository.LocalDatabase;

public class TicketPresenter implements TicketContract.Presenter {
    private final LocalDatabase database;

    public TicketPresenter(LocalDatabase database) {
        this.database = database;
    }

    private TicketContract.View view;

    @Override
    public void attach(TicketContract.View view) {
        this.view = view;
        mainMenu();
    }

    private void mainMenu() {
        view.countryMenu(database.getCountries());
    }

    @Override
    public void chooseCountry(Country country) {
        if (country != null) {
            view.ticketMenu(country, database.getTickets(country));
        } else {
            mainMenu();
        }
    }

    @Override
    public void chooseTicket(Ticket ticket) {
        if (ticket != null) {
            view.quantityMenu(ticket);
        } else {
            mainMenu();
        }
    }

    @Override
    public void placeOrder(Order order) {
        if (order != null) {
            view.orderMenu(database.getOrders(), order);
        } else {
            mainMenu();
        }
    }

    @Override
    public void confirmOrder(Order order) {
        if (order != null) {
            database.saveOrder(order);
        }
        mainMenu();
    }
}
