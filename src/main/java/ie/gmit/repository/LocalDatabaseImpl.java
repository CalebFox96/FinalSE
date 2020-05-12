package ie.gmit.repository;

import ie.gmit.data.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LocalDatabaseImpl implements LocalDatabase {

    private HashMap<Country, ArrayList<Ticket>> tickets = new HashMap<>();
    private ArrayList<Country> countries = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public LocalDatabaseImpl() {
        Country england = new Country("England");
        Country spain = new Country("Spain");
        Country germany = new Country("Germany");
        Country france = new Country("France");
        countries.add(england);
        countries.add(spain);
        countries.add(germany);
        countries.add(france);

        EPL liverpool = new EPL();
        liverpool.setTicketCode("liverpool");
        liverpool.setMatch("Liverpool vs Chelsea");
        liverpool.setDate("April 14th");
        liverpool.setLocation("Stanford Bridge");
        liverpool.setSeatNumber("20B");
        liverpool.setTicketNumber("1234c787");
        liverpool.setPrice(65.00);

        EPL city = new EPL();
        city.setTicketCode("city");
        city.setMatch("Man City vs Liverpool");
        city.setDate("April 10th");
        city.setLocation("Eithad Stadium");
        city.setSeatNumber("345C");
        city.setTicketNumber("234D2");
        city.setPrice(55.34);

        EPL united = new EPL();
        united.setTicketCode("united");
        united.setMatch("Liverpool vs Man United");
        united.setDate("May 12th");
        united.setLocation("Anfield Stadium");
        united.setSeatNumber("68F");
        united.setTicketNumber("124A34");
        united.setPrice(49.90);

        ArrayList<Ticket> englands = new ArrayList<>();
        englands.add(liverpool);
        englands.add(city);
        englands.add(united);
        tickets.put(england, englands);

        LaLiga madrid = new LaLiga();
        madrid.setTicketCode("madrid");
        madrid.setMatch("Real vs Barca");
        madrid.setDate("May 3rd");
        madrid.setLocation("Santiago Bernabu");
        madrid.setSeatNumber("69C");
        madrid.setTicketNumber("125CB1");
        madrid.setPrice(90.00);

        LaLiga barca = new LaLiga();
        barca.setTicketCode("barca");
        barca.setMatch("Barcelona vs Malaga");
        barca.setDate("Feb 12th");
        barca.setLocation("Barcelona Stadium");
        barca.setSeatNumber("20A");
        barca.setTicketNumber("74CF213");
        barca.setPrice(65.00);

        LaLiga atletico = new LaLiga();
        atletico.setTicketCode("atletico");
        atletico.setMatch("Atletico vs Real Madrid");
        atletico.setDate("March 20th");
        atletico.setLocation("Atletico Stadium");
        atletico.setSeatNumber("51S");
        atletico.setTicketNumber("124F65");
        atletico.setPrice(39.90);

        ArrayList<Ticket> spains = new ArrayList<>();
        spains.add((madrid));
        spains.add(barca);
        spains.add(atletico);
        tickets.put(spain, spains);

        Bundesliga bayern = new Bundesliga();
        bayern.setTicketCode("bayern");
        bayern.setMatch("Real vs Bayern");
        bayern.setDate("May 3rd");
        bayern.setLocation("Santiago Bernabu");
        bayern.setSeatNumber("69C");
        bayern.setTicketNumber("125CB1");
        bayern.setPrice(90.00);

        Bundesliga dortmund = new Bundesliga();
        dortmund.setTicketCode("dortmund");
        dortmund.setMatch("Dortmund vs Malaga");
        dortmund.setDate("Feb 12th");
        dortmund.setLocation("Barcelona Stadium");
        dortmund.setSeatNumber("20A");
        dortmund.setTicketNumber("74CF213");
        dortmund.setPrice(65.00);

        Bundesliga schalke = new Bundesliga();
        schalke.setTicketCode("schalke");
        schalke.setMatch("Schalke vs Real Madrid");
        schalke.setDate("March 20th");
        schalke.setLocation("Atletico Stadium");
        schalke.setSeatNumber("51S");
        schalke.setTicketNumber("124F65");
        schalke.setPrice(39.90);

        ArrayList<Ticket> germaries = new ArrayList<>();
        germaries.add(bayern);
        germaries.add(dortmund);
        germaries.add(schalke);
        tickets.put(germany, germaries);

        Ligue1 psg = new Ligue1();
        psg.setTicketCode("psg");
        psg.setMatch("PSG vs Bayern");
        psg.setDate("May 3rd");
        psg.setLocation("Santiago Bernabu");
        psg.setSeatNumber("69C");
        psg.setTicketNumber("125CB1");
        psg.setPrice(90.00);

        Ligue1 marseille = new Ligue1();
        marseille.setTicketCode("marseille");
        marseille.setMatch("Marseille vs Malaga");
        marseille.setDate("Feb 12th");
        marseille.setLocation("Barcelona Stadium");
        marseille.setSeatNumber("20A");
        marseille.setTicketNumber("74CF213");
        marseille.setPrice(65.00);

        Ligue1 lile = new Ligue1();
        lile.setTicketCode("lile");
        lile.setMatch("Lile vs Real Madrid");
        lile.setDate("March 20th");
        lile.setLocation("Atletico Stadium");
        lile.setSeatNumber("51S");
        lile.setTicketNumber("124F65");
        lile.setPrice(39.90);

        ArrayList<Ticket> frances = new ArrayList<>();
        frances.add(psg);
        frances.add(marseille);
        frances.add(lile);
        tickets.put(france, frances);
    }

    @Override
    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public List<Ticket> getTickets(Country country) {
        return tickets.get(country);
    }

    @Override
    public void saveOrder(Order order) {
        orders.add(order);
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}
