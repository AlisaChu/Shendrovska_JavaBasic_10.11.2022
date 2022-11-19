package less5;
import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        int number, player, attempts = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number (from 0 to 10).");
        number = (int)Math.floor(Math.random() * 10);
        do {
            attempts++;
            if (attempts == 4) {
                System.out.println("You have no more attempts left. Game over");
                break;
            }
            System.out.println("Remaining attempts: " + (4 - attempts));

            System.out.print("Enter your number:");
            player = input.nextInt();
            if (player > number)
                System.out.println("My number is less.");
            else if (player < number) System.out.println("My number is greater.");
            else System.out.println("You guessed!");
        } while (player != number);
        System.out.println("Number of attempts: " + attempts);
    }
}



