package less8;
import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1, team2;;
        int ter1, ter2, ter3, ter4, ter5,
                conTer1, conTer2, conTer3, conTer4, conTer5;

        System.out.println("get name team 1");

        team1 = scanner.nextLine();

        System.out.println("get name team 2");

        team2 = scanner.nextLine();

        System.out.println("1 team points");

        ter1 = scanner.nextInt();
        ter2 = scanner.nextInt();
        ter3 = scanner.nextInt();
        ter4 = scanner.nextInt();
        ter5 = scanner.nextInt();

        System.out.println("2 team points");

        conTer1 = scanner.nextInt();
        conTer2 = scanner.nextInt();
        conTer3 = scanner.nextInt();
        conTer4 = scanner.nextInt();
        conTer5 = scanner.nextInt();

        int [] players1 = {ter1, ter2, ter3, ter4, ter5};
        int [] players2 = {conTer1, conTer2, conTer3, conTer4, conTer5};
        int result = 0;
        for (int m : players1){
            result += m;
        }
        int result2 = 0;
        for (int k : players2){
            result2 += k;
        }
        if (result > result2){
            System.out.println("win team team1 get points" + " "+ result/players1.length);
        }
        if (result < result2){
            System.out.println("win team team2 get points" + " " + result2/players2.length);
        }
        else if (result==result2){
            System.out.println("draw");
        }
        System.out.println(result/players1.length);
        System.out.println(result2/players2.length);
    }
}

