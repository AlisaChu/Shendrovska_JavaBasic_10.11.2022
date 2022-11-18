package less777;
import java.util.Scanner;

public class Drinks {

    public static final double COFFEE_PRICE = 1.3;
    public static final double TEA_PRICE = 0.90;
    public static final double LEMONADE_PRICE = 2;
    public static final double MOJITO_PRICE = 2.3;
    public static final double MINERAL_PRICE = 1.5;
    public static final double COCA_COLA_PRICE = 1.2;
    public static double sum = 0;

    Scanner nn = new Scanner(System.in);

    public int coffeePrepare() {
        System.out.println("A cup of coffee is price: " + COFFEE_PRICE + "₴");
        System.out.print("Enter the number of cups of coffee: ");
        int amount = nn.nextInt();
        sum = (amount * COFFEE_PRICE);
        return nn.nextInt();
    }

    public int teaPrepare() {
        System.out.println("A cup of tea is price: " + TEA_PRICE + "₴");
        System.out.println("Enter the number of cups of tea: ");
        int amount = nn.nextInt();
        sum = (amount * TEA_PRICE);
        return nn.nextInt();
    }

    public int lemonadePrepare() {
        System.out.println("A cup of lemonade is price: " + LEMONADE_PRICE + "₴");
        System.out.print("Enter the number of cups of lemonade: ");
        int amount = nn.nextInt();
        sum =(amount * LEMONADE_PRICE);
        return nn.nextInt();
    }

    public int mojitoPrepare() {
        System.out.println("A cup of mojito is price: " + MOJITO_PRICE + "₴");
        System.out.print("Enter the number of cups of mojito: ");
        int amount = nn.nextInt();
        sum =(amount * MOJITO_PRICE);
        return nn.nextInt();
    }

    public int mineralPrepare() {
        System.out.println("A cup of mineral water is price: " + MINERAL_PRICE + "₴");
        System.out.print("Enter the number of cups of mineral water: ");
        int amount = nn.nextInt();
        sum =(amount * MINERAL_PRICE);
        return nn.nextInt();
    }

    public int coca_colaPrepare() {
        System.out.println("A cup of coca-cola is price: " + COCA_COLA_PRICE + "₴");
        System.out.print("Enter the number of cups of Coca-Cola: ");
        int amount = nn.nextInt();
        sum =(amount * COCA_COLA_PRICE);
        return nn.nextInt();
    }
}