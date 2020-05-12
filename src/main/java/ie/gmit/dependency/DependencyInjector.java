package ie.gmit.dependency;

import ie.gmit.contract.TicketContract;
import ie.gmit.presenter.TicketPresenter;
import ie.gmit.repository.LocalDatabase;
import ie.gmit.repository.LocalDatabaseImpl;
import ie.gmit.view.TicketView;
import ie.gmit.view.component.InputManager;

public class DependencyInjector {
    private static DependencyInjector instance;

    public static DependencyInjector getInstance() {
        return instance;
    }

    public static void setInstance(DependencyInjector instance) {
        DependencyInjector.instance = instance;
    }

    public InputManager provideInputManager() {
        return new InputManager(System.in, System.out);
    }

    public TicketContract.Presenter provideTicketPresenter() {
        return new TicketPresenter(provideLocalDatabase());
    }

    public TicketContract.View provideTicketView() {
        return new TicketView(
                provideInputManager(),
                System.out,
                provideTicketPresenter()
        );
    }

    private LocalDatabase singletonDatabase;
    public LocalDatabase provideLocalDatabase() {
        if (singletonDatabase == null) {
            singletonDatabase = new LocalDatabaseImpl();
        }

        return singletonDatabase;
    }
}
