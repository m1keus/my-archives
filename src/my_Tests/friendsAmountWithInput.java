package my_Tests;

import java.util.Scanner;
public class friendsAmountWithInput {
    public static void main(String[] args) {

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
