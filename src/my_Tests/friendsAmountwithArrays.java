package my_Tests;

import java.util.Scanner;

public class friendsAmountwithArrays {

    public static void main(String[] args) {

/*        ArrayList<String> friendsList = new ArrayList<String>();

        friendsList.add("David");
        friendsList.add("Bob");
        friendsList.add("Henry");

        System.out.println(friendsList);

        System.out.println("Do yo want to see only one of your friends?");
        System.out.println("If you want to see only one of your friends, type YES to continue");
        System.out.println("If you are not interessted, type NO");

        Scanner scanner = new Scanner(System.in);
        String responce = scanner.next();

        if (responce.equals("Yes") || responce.equals("yes") || responce.equals("YES")) {
            System.out.println("Ok, loading... ");
            friendsOperation();
        } else if (responce.equals("No") || responce.equals("no") || responce.equals("NO")) {
            System.out.println("Ok, stopping tasks");
        } else {
            System.out.println("Something went wrong, pls try again");
        }

*/





/*        System.out.println("Hello!");
        System.out.println("Type 1 to continue!");

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        if (numberOne == 1) {
            friendsOperation();
        } else {
            System.out.println("Something went wroong, please try again!");
        }
*/


    }

    static void questionYesOrNo() {

        Scanner scanner = new Scanner(System.in);

        String responce = scanner.next();

        if (responce.equals("Yes") || responce.equals("yes")) {
            yes();
        } else if (responce.equals("No") || responce.equals("no")) {
            no();
        } else {
            System.out.println("Something went wront, pls try again");
        }
    }

    static void yes() {
        System.out.println("YES");
    }

    static void no() {
        System.out.println("NO");
    }



    static void friendsOperation() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Write your friends amount: ");
        int friendsAmount = scanner.nextInt();

        System.out.println("Your have " + friendsAmount + " friends");

        System.out.println("Do you want to calculate your friends?");
        System.out.println("If you want to calculate your friends, type - Yes");
        System.out.println("If you dont want to calculate your friends, type - No");

        String responce = scanner.next();

        if (responce.equals("Yes") || responce.equals("yes")) {

            System.out.println("Perfect! Lets see all about your friends!");

            int friendsPlusOne = friendsAmount + 1;
            int friendsMinusOne = friendsAmount - 1;
            int freindsMultiplyByTwo = friendsAmount * 2;
            int friendsDevideByTwo = friendsAmount / 2;
            double friendsFullDevideByThree = friendsAmount / 3;


            System.out.println("You have " + friendsAmount + " friends");
            System.out.println("Friends + 1: " + friendsPlusOne);
            System.out.println("Friends - 1: " + friendsMinusOne);
            System.out.println("Friends * 2: " + freindsMultiplyByTwo);
            System.out.println("Friends / 2: " + friendsDevideByTwo);
            System.out.println("Friends / 3: " + friendsFullDevideByThree);

        } else if (responce.equals("No") || responce.equals("no")) {

            System.out.println("Ok! The task is ended!");

        } else {

            System.out.println("Something went wrong try again");
        }

    }
}
