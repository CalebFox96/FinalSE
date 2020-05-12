package ie.gmit.repository;

import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;

import java.util.List;

public interface LocalDatabase {
    List<Country> getCountries();

    List<Ticket> getTickets(Country country);

    void saveOrder(Order order);

    List<Order> getOrders();
}
