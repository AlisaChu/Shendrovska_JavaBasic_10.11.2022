package Practice;

public class Skirt extends Clothes implements Woman {

    public Skirt(Size size, String color) {
        super(size, color);
    }
    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size = " + getSize() +
                ", coast = " + getCost() + " euro" +
                ", color = " + getColor() +
                "}";
    }
}

