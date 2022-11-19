package less14;

public class Androids extends LinuxOS implements Smartphones {
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

    void linuxOs() {
        System.out.println("Hello android!");
    }
}