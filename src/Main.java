import java.util.Random;

public class Main {
    public static void main(String[] args) {
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
    }

    public static void rollSixDice() {
        Random rand = new Random();
        System.out.print("6 dices roll: ");
        for (int i = 0; i < 6; i++) {
            int roll = rand.nextInt(6) + 1;
            System.out.print("Roll #" + (i + 1) + ": " + roll + " ");
        }
        System.out.println();
    }
}
