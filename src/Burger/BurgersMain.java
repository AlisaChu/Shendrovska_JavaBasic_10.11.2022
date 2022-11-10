package Burger;

public class BurgersMain {

    public static void main(String[] args) {

        Burgers classicBurger = new Burgers("bun","meat","cheese","greens",
                "mayonnaise");
        Burgers dietBurger = new Burgers("bun","meat","cheese","greens");
        Burgers doubleBurger = new Burgers(2,"bun","cheese","greens","mayonnaise");

        System.out.println();
        System.out.println(classicBurger.classicBurger());
        System.out.println(dietBurger.dietBurger());
        System.out.println(doubleBurger.doubleBurger());
    }
}


