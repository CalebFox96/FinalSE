package ie.gmit.data;

import java.text.NumberFormat;

public class Ticket {
    private String ticketCode;
    private String seatNumber;
    private String match;
    private String location;
    private String date;
    private String ticketNumber;
    private double price;
    protected static int count = 0;


    public Ticket() {
    }

    public void setTicketCode(String code) {
        this.ticketCode = code;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public String getSeatNumber() { return seatNumber; }

    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getMatch() { return match; }

    public void setMatch(String match) { this.match = match; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getTicketNumber() { return ticketNumber; }

    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDescription() {
//        return description;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString() {
        return match;
    }

    public static int getCount() {
        return count;
    }
}
