package logical_Operators;

import java.util.Scanner;

public class NOT_example {
    //reverse boolean value of a condition (!)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        } else if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You have typed something wrong or you decided to continue playing!");
        } else {
            System.out.println("You are still playing the game!");
        }

    }
}
