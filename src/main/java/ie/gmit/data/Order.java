package ie.gmit.data;

public class Order {
    private final Ticket ticket;
    private final int quantity;

    public Order(Ticket ticket, int quantity) {
        this.ticket = ticket;
        this.quantity = quantity;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getQuantity() {
        return quantity;
    }
}
