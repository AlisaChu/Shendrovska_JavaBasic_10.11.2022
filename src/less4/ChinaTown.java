package less4;

public class ChinaTown {
    public static void main(String[] args) {

        double liWarriorAttack = 13;
        double liArcherAttack = 24;
        double liRiderAttack = 46;
        int liWarrior = 860;

        double minnWarriorAttack = 9;
        double minnArcherAttack = 35;
        double minnRiderAttack = 12;
        double a = 1.5;
        int minnWarrior = (int) (a * liWarrior);

        double liAverageAttack = ((liWarriorAttack + liArcherAttack + liRiderAttack)/3);
        double minnAverageAttack = ((minnWarriorAttack + minnArcherAttack + minnRiderAttack)/3);
        double liTotalAttack = (liAverageAttack * liWarrior);
        double minnTotalAttack= (minnAverageAttack * minnWarrior);

        System.out.println("Li Total average attack is " + liTotalAttack);
        System.out.println("Minn Total average attack is " + minnTotalAttack);
    }
}

