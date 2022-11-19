package Practice1;

public class Tie extends Clothes implements Man {
    public Tie(String color, Size size) {
        super(size, color);
    }

    public Tie(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size = " + getSize() +
                ", coast = " + getCost() + " euro" +
                ", color = " + getColor() +
                "}";
    }
}