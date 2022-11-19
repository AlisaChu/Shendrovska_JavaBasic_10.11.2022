package less14;

public class iPhones extends iOS implements Smartphones {
    @Override
    public void call() {
        System.out.println("Call me");

    }

    @Override
    public void sms() {
        System.out.println("Write sms");

    }

    @Override
    public void internet() {
        System.out.println("Use instagram");

    }

    @Override
    void ios() {
        System.out.println("Hello iPhone!");

    }
}
