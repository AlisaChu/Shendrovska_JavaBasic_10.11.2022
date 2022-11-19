package less14;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids();
        iPhones iPhones = new iPhones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxOs();

        System.out.println();

        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.ios();

    }
}
