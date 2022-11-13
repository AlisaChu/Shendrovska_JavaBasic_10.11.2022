package less777;
import java.util.Scanner;
import java.util.Arrays;

public class DrinksMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Drinks drinks = new Drinks();

        boolean a = true;
        while (a) {
            System.out.println("Choose a drink: ");
            System.out.println(Arrays.toString(DrinkMachine.values()));
            String choice = sc.nextLine();

            choice = choice.toUpperCase();
            DrinkMachine drinksMachine = DrinkMachine.valueOf(choice);

            switch (drinksMachine) {
                case COFFEE:
                    drinks.coffeePrepare();
                    break;
                case TEA:
                    drinks.teaPrepare();
                    break;
                case LEMONADE:
                    drinks.lemonadePrepare();
                    break;
                case MOJITO:
                    drinks.mojitoPrepare();
                    break;
                case MINERAL:
                    drinks.mineralPrepare();
                    break;
                case COCA_COLA:
                    drinks.coca_colaPrepare();
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Total price " + Drinks.getSum());


            System.out.println("Would you like anything else?  Yes/No");

            boolean moreDrinks = true;
            while (moreDrinks) {
                String answer = sc.nextLine();
                if (answer.equals("No") || answer.equals("NO") || answer.equals("no")) {
                    moreDrinks = false;
                    a = false;
                } else if (answer.equals("Yes") || answer.equals("YES") || answer.equals("yes")) {
                    moreDrinks = false;
                } else {
                    System.out.println("Answer - YES/NO");

                }
            }
        }
    }
}

