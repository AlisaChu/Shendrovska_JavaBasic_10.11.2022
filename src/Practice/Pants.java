package Practice;

public class Pants extends Clothes implements Man, Woman {
    public Pants(Size size, String color) {
        super(size, color);
    }
    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Pants{" +
                "size = " + getSize() +
                ", coast = " + getCost() + " euro" +
                ", color = " + getColor() +
                "}";
    }
}

