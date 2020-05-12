package ie.gmit.contract;

public interface BaseContract {
    interface BasePresenter<T extends BaseView> {
        void attach(T view);
    }

    interface BaseView {
        void start();
    }
}
