package ie.gmit.view;

import ie.gmit.contract.TicketContract;
import ie.gmit.data.Country;
import ie.gmit.data.Order;
import ie.gmit.data.Ticket;
import ie.gmit.view.component.InputManager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.List;

public class TicketView implements TicketContract.View {

    private final InputManager inputManager;
    private final PrintStream outputStream;
    private final TicketContract.Presenter presenter;
    // Declaring Variables
    public static JFrame Layout;
    private static JButton BuyTicket;
    public static JPanel MainPanel, SubPanel;
    private static JLabel Title, TicketCount;
    private JTextField TicketQuantity;
    private static JComboBox CountryBox;
    private static JComboBox EngBox, SpainBox, GermanyBox, FranceBox;
    private static String SeatsData[][] = new String[15][6];
    private static String SeatsHeading[];
    private static JTable SeatsTable;
    private static JScrollPane TablePane;
    private static int Count = 0;
    private int SelectedCity = 0;
    int SN = 0;
    String CountryData[] = {"Select Country", "England", "Spain", "Germany", "France" };
    String EngTeam[] = { "Select City", "Livepool", "City", "Man United" };
    String SpainTeam[] = { "Select City", "Real Madrid", "Barcelona", "Atletico Madrid" };
    String GermanyTeam[] = { "Select City", "Bayern Munich", "Borrussia Dortmund", "FC Schalke 04" };
    String FranceTeam[] = { "Select City", "PSG", "Lile", "Marseille" };

    public TicketView(
            InputManager inputManager, PrintStream printStream, TicketContract.Presenter presenter
    ) {
        this.inputManager = inputManager;
        this.outputStream = printStream;
        this.presenter = presenter;
    }

    @Override
    public void start() {
        presenter.attach(this);
    }

    @Override
    public void countryMenu(List<Country> countries) {

        Title = new JLabel("Welcome to the Ticket Viewer");
        TicketQuantity = new JTextField();

        final int[] selectNumber = new int[1];
        TicketCount = new JLabel();
        SeatsHeading = new String[] { "Match", "Location", "Price", "Date", "Seat No.", "Ticket No." };
        SeatsTable = new JTable(SeatsData, SeatsHeading);
        TablePane = new JScrollPane(SeatsTable);

        SubPanel = new JPanel();
        // Adding margins in top down left right
        SubPanel.setBorder(new EmptyBorder(10, 50, 10, 50));
        // Setting coordinates of Button and label etc
        SubPanel.setLayout(new GridLayout(5, 5, 10, 10));
        MainPanel = new JPanel();
        MainPanel.add(SubPanel);
        // Adding margins in top down left right
        MainPanel.setBorder(new EmptyBorder(50, 50, 50, 50));
        // Adding coordinates to add button
        MainPanel.setLayout(new GridLayout(3, 3, 10, 10));

        EngBox = new JComboBox(EngTeam);
        EngBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (EngBox.getSelectedItem().equals("Livepool"))
                    SelectedCity = 1;
                else if (EngBox.getSelectedItem().equals("City"))
                    SelectedCity = 2;
                else if (EngBox.getSelectedItem().equals("Man United"))
                    SelectedCity = 3;
                else
                    JOptionPane.showMessageDialog(null, "Invalid Input");

            }
        });

        SpainBox = new JComboBox(SpainTeam);
        SpainBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (SpainBox.getSelectedItem().equals("Real Madrid"))
                    SelectedCity = 1;
                else if (SpainBox.getSelectedItem().equals("Barcelona"))
                    SelectedCity = 2;
                else if (SpainBox.getSelectedItem().equals("Atletico Madrid"))
                    SelectedCity = 3;
                else
                    JOptionPane.showMessageDialog(null, "Invalid Input");

            }
        });

        GermanyBox = new JComboBox(GermanyTeam);
        GermanyBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (GermanyBox.getSelectedItem().equals("Bayern Munich"))
                    SelectedCity = 1;
                else if (GermanyBox.getSelectedItem().equals("Borrussia Dortmund"))
                    SelectedCity = 2;
                else if (GermanyBox.getSelectedItem().equals("FC Schalke 04"))
                    SelectedCity = 3;
                else
                    JOptionPane.showMessageDialog(null, "Invalid Input");

            }
        });

        FranceBox = new JComboBox(FranceTeam);
        FranceBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (FranceBox.getSelectedItem().equals("PSG"))
                    SelectedCity = 1;
                else if (FranceBox.getSelectedItem().equals("Lile"))
                    SelectedCity = 2;
                else if (FranceBox.getSelectedItem().equals("Marseille"))
                    SelectedCity = 3;
                else
                    JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        });

        BuyTicket = new JButton("Buy Ticket");
        BuyTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Country selected = null;
                if (SN > 0) {
                    if (SN <= countries.size()) {
                        selected = countries.get(SN - 1);
                    }
                    presenter.chooseCountry(selected);
                }
                SeatsTable = new JTable(SeatsData, SeatsHeading);
                TablePane = new JScrollPane(SeatsTable);
                SubPanel.removeAll();
                SubPanel.add(Title);
                SubPanel.add(CountryBox);
                MainPanel.removeAll();
                MainPanel.add(SubPanel);
                TablePane = new JScrollPane(SeatsTable);
                MainPanel.add(TablePane);
                // Adding panel to frame
                Layout.setVisible(true);
            }
        });

        CountryBox = new JComboBox(CountryData);
        CountryBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                SubPanel.removeAll();
                SubPanel.add(Title);
                SubPanel.add(CountryBox);
                if (CountryBox.getSelectedItem().equals("England")) {
                    SubPanel.add(EngBox);
                    SubPanel.add(TicketQuantity);
                    SubPanel.add(BuyTicket);
                    SN = 1;
                } else if (CountryBox.getSelectedItem().equals("Spain")) {
                    SubPanel.add(SpainBox);
                    SubPanel.add(TicketQuantity);
                    SubPanel.add(BuyTicket);
                    SN = 2;
                } else if (CountryBox.getSelectedItem().equals("Germany")) {
                    SubPanel.add(GermanyBox);
                    SubPanel.add(TicketQuantity);
                    SubPanel.add(BuyTicket);
                    SN = 3;
                } else if (CountryBox.getSelectedItem().equals("France")) {
                    SubPanel.add(FranceBox);
                    SubPanel.add(TicketQuantity);
                    SubPanel.add(BuyTicket);
                    SN = 4;
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                Layout.setVisible(true);

            }
        });


        SubPanel.add(Title);
        SubPanel.add(CountryBox);
        MainPanel.remove(TablePane);
        MainPanel.add(TablePane);
        // Creating a JFrame
        Layout = new JFrame("Ticket System");
        // Setting size of the application
        Layout.setSize(700, 700);
        // Showing the frame
        Layout.setVisible(true);
        // Make it show in center of screen
        Layout.setLocationRelativeTo(null);
        // Adding panel to frame
        Layout.add(MainPanel, BorderLayout.CENTER);
        //exit
    }

    @Override
    public void ticketMenu(Country country, List<Ticket> tickets) {
        int selectIndex = SelectedCity;

        Ticket selected = null;
        if (selectIndex < tickets.size()) {
            selected = tickets.get(selectIndex);
        }

        presenter.chooseTicket(selected);
    }

    @Override
    public void quantityMenu(Ticket ticket) {
        int quantity = Integer.parseInt(TicketQuantity.getText());

        Order order = new Order(ticket, quantity);

        presenter.placeOrder(order);
    }

    @Override
    public void orderMenu(List<Order> orders, Order order) {
        printTicket(order.getTicket());

        int total = 0;

        for(Order owned : orders) {
            total += owned.getQuantity();
        }
        //JOptionPane.showMessageDialog(null, "Product owned: " + total + " New Product: " + order.getQuantity());
        JOptionPane.showMessageDialog(null, " New Product: " + order.getQuantity());
    }

    private void printTicket(Ticket ticket) {
        SeatsData[Count][0] = ticket.toString();
        SeatsData[Count][1] = ticket.getLocation();
        SeatsData[Count][2] = ticket.getPriceFormatted();
        SeatsData[Count][3] = ticket.getDate();
        SeatsData[Count][4] = ticket.getSeatNumber();
        SeatsData[Count][5] = ticket.getTicketNumber();
        Count++;
    }
}
