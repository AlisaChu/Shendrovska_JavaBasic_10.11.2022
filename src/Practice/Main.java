package Practice;

public class Main {
    public static void main(String[] args) {

    Clothes[] clothes = {
            new Tshirt(Size.M, "white", 15),
            new Pants(Size.XXS, "black", 25),
            new Skirt(Size.S, "red", 20),
            new Skirt(Size.M, "blue", 28),
            new Tie(Size.L, "violet", 100),
            new Tie(Size.L, "heavenly", 80),
    };

    MakingStudio studio = new MakingStudio();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
}
}

