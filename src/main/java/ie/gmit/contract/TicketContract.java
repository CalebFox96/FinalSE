package ie.gmit.contract;

import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;

import java.util.List;

public interface TicketContract {
    interface View extends BaseContract.BaseView {

        void countryMenu(List<Country> countries);

        void ticketMenu(Country country, List<Ticket> tickets);

        void quantityMenu(Ticket ticket);

        void orderMenu(List<Order> orders, Order order);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {

        void chooseCountry(Country country);

        void chooseTicket(Ticket ticket);

        void placeOrder(Order order);

        void confirmOrder(Order order);

    }
}
