package less6;

public class Shuttle {
    public static void main(String[] args) {
        int shuttle = 0, number = 0;
        while (shuttle < 100) {
            String s = String.valueOf(++number);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println(number);
            shuttle++;
            System.out.println("lucky name of Shuttle " + number);
            System.out.println("shuttle number " + shuttle);
        }
        System.out.println("in all shuttle numbers we exclude 4 and 9");
    }
}

