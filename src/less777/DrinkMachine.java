package less777;

public enum DrinkMachine {

    COFFEE(1.30), TEA(0.90), LEMONADE(2.0), MOJITO(2.30), MINERAL(1.5), COCA_COLA(1.2);

    private final double price;

    DrinkMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}



