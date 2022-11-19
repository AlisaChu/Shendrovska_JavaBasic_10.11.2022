package Practice1;

public class Tshirt extends Clothes implements Man,Woman {


    public Tshirt(Size size, String color) {
        super(size, color);
    }
    public Tshirt(Size size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "T-shirt{" +
                "size = " + getSize() +
                ", coast = " + getCost() + " euro" +
                ", color = " + getColor() +
                "}";
    }
}

