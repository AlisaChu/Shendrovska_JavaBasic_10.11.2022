package Practice1;

public class MakingStudio {
    public void dressMale(Clothes[] clothes) {
        System.out.println("Mans clothes (in stock):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Man) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Woman clothes (in stock):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Woman) {
                System.out.println(clothe);
            }
        }
    }
}

