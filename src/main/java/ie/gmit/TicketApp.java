package ie.gmit;


import ie.gmit.contract.TicketContract;
import ie.gmit.dependency.DependencyInjector;

public class TicketApp {

    public static void main(String[] args) {
        DependencyInjector injector = new DependencyInjector();

        TicketContract.View view = injector.provideTicketView();

        view.start();
    }

}