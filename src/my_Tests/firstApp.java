package my_Tests;

import java.util.ArrayList;
import java.util.Scanner;
public class firstApp {

    // MAIN MENU ---------------------------------------
    public static void main(String[] args) {

        ArrayList<String> tasksList = new ArrayList<String>();

        tasksList.add("FRIENDS CALCULATOR - 1");
        tasksList.add("FRIENDS AMOUNT - 2");
        tasksList.add("STOP THIS TASK - 3");


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Hello!");
        System.out.println("In this app you can do multiply tasks with your friends!");
        System.out.println("Now you can see all the tasks that this program can solve!");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(tasksList);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("To continue, please select one of those options pressing the right number!");
        System.out.println("--------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println("--------------------------------------------------------------------------------");

        if (choice == 1) {
            System.out.println("You have choiced FRIENDS CALCULATOR!");
            System.out.println("Starting...!");
            System.out.println("--------------------------------------------------------------------------------");
            friendsCalculatorTask();
        } else if (choice == 2) {
            System.out.println("You have choiced FRIENDS AMOUNT!");
            System.out.println("Starting...!");
            System.out.println("--------------------------------------------------------------------------------");
            friendsAmountTask();
        } else if (choice == 3) {
            System.out.println("You have choiced to END THE TASK!");
            System.out.println("Closing...!");
            System.out.println("--------------------------------------------------------------------------------");
            endTask();
        }

    }

    // FRIENDS CALCULATOR TASK ----------------------------------------
    static void friendsCalculatorTask() {

        // ARRAY LIST FOR FRIENDS CALCULATOR --------------------------------
        ArrayList<String> friendsCalculatorOptions = new ArrayList<String>();

        friendsCalculatorOptions.add("PLUS YOUR FRIENDS - 1");
        friendsCalculatorOptions.add("MINUS YOUR FRIENDS - 2");
        friendsCalculatorOptions.add("MULTIPLY YOUR FRIENDS - 3");
        friendsCalculatorOptions.add("DEVIDE YOUR FRIENDS - 4");


        System.out.println("Hello, you are in the FRIENDS CALCULATOR program");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Type your friends amount, to continue: ");
        System.out.println("--------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int friendsAmount = scanner.nextInt();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("You have " + friendsAmount + " friends");

        // APPLYING FRIENDS AMOUNT -------------------------------------------

        System.out.println("If this number is correct, plase type CORRECT: ");
        System.out.println("--------------------------------------------------------------------------------");

        String correct = scanner.next();
        System.out.println("--------------------------------------------------------------------------------");

        if (correct.equals("CORRECT") || correct.equals("Correct") || correct.equals("correct")) {
            System.out.println("You have agreed that you have " + friendsAmount + " friends and this number is correct!");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Select what you are going to do next");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println(friendsCalculatorOptions);
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("To sellect the right option, again type the right number: ");
            System.out.println("--------------------------------------------------------------------------------");

            int choice2 = scanner.nextInt();
            System.out.println("--------------------------------------------------------------------------------");

            // MAKING A CHOICE WHICH CALCULATION TASK TO DO ----------------------------

            if (choice2 == 1) {

                // PLUSSING FRIENDS AMOUNT ---------------------------------------------

                ArrayList<String> continueCalculatingOrNot = new ArrayList<String>();

                continueCalculatingOrNot.add("TRY TO CALCULATE AGAIN - 1");
                continueCalculatingOrNot.add("END THE TASK - 2");

                System.out.println("You have " + friendsAmount + " friends");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Please enter the number that you want to plus to your friends");

                int typedNumberForPlusTask = scanner.nextInt();
                System.out.println("--------------------------------------------------------------------------------");

                int friendsAmountAfterPlus = friendsAmount + typedNumberForPlusTask;

                System.out.println("Friends plussing operation is completed!");
                System.out.println("Now you have " + friendsAmountAfterPlus + " friends");

                System.out.println("--------------------------------------------------------------------------------");

                System.out.println("If you want to calculate your friends again, then type the right option for you again!");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(continueCalculatingOrNot);
                System.out.println("--------------------------------------------------------------------------------");

                int choice3 = scanner.nextInt();
                System.out.println("--------------------------------------------------------------------------------");

                if (choice3 == 1) {


                    System.out.println("You have selected to calculate again!");
                    System.out.println("Continuing...");
                    System.out.println("--------------------------------------------------------------------------------");
                    friendsCalculatorTask();

                } else if (choice3 == 2) {

                    System.out.println("You selected to stop the task!");
                    System.out.println("Stopping");
                    System.out.println("--------------------------------------------------------------------------------");
                }

            } else if (choice2 == 2) {

                // MINUSING FRIENDS AMOUNT ------------------------------------------

                ArrayList<String> continueCalculatingOrNot = new ArrayList<String>();

                continueCalculatingOrNot.add("TRY TO CALCULATE AGAIN - 1");
                continueCalculatingOrNot.add("END THE TASK - 2");

                System.out.println("You have " + friendsAmount + " friends");
                System.out.println("Please enter the number that you want to minus out of your friends");

                int typedNumberForMinusTask = scanner.nextInt();

                int friendsAmountAfterMinus = friendsAmount - typedNumberForMinusTask;

                System.out.println("Friends minusing operation is completed!");
                System.out.println("Now you have " + friendsAmountAfterMinus + " friends");

                System.out.println("If you want to calculate your friends again, then type the right option for you again!");
                System.out.println(continueCalculatingOrNot);

                int choice3 = scanner.nextInt();

                if (choice3 == 1) {

                    System.out.println("You have selected to calculate again!");
                    System.out.println("Continuing...");
                    friendsCalculatorTask();

                } else if (choice3 == 2) {

                    System.out.println("You selected to stop the task!");
                    System.out.println("Stopping");
                }


            } else if (choice2 == 3) {

                // MULTIPLYING FRIENDS AMOUNT ------------------------------------------

                ArrayList<String> continueCalculatingOrNot = new ArrayList<String>();

                continueCalculatingOrNot.add("TRY TO CALCULATE AGAIN - 1");
                continueCalculatingOrNot.add("END THE TASK - 2");

                System.out.println("You have " + friendsAmount + " friends");
                System.out.println("Please enter the number on witch you want to multiply your friends!");

                int typedNumberForMultiplyingTask = scanner.nextInt();

                int friendsAmountAfterMultiplying = friendsAmount * typedNumberForMultiplyingTask;

                System.out.println("Friends minusing operation is completed!");
                System.out.println("Now you have " + friendsAmountAfterMultiplying + " friends");

                System.out.println("If you want to calculate your friends again, then type the right option for you again!");
                System.out.println(continueCalculatingOrNot);

                int choice3 = scanner.nextInt();

                if (choice3 == 1) {

                    System.out.println("You have selected to calculate again!");
                    System.out.println("Continuing...");
                    friendsCalculatorTask();

                } else if (choice3 == 2) {

                    System.out.println("You selected to stop the task!");
                    System.out.println("Stopping");
                }

            } else if (choice2 == 4) {

                // DEVIDING FRIENDS AMOUNT ------------------------------------------

                ArrayList<String> continueCalculatingOrNot = new ArrayList<String>();

                continueCalculatingOrNot.add("TRY TO CALCULATE AGAIN - 1");
                continueCalculatingOrNot.add("END THE TASK - 2");

                System.out.println("You have " + friendsAmount + " friends");
                System.out.println("Please enter the number on witch you want to devide your friends!");

                int typedNumberForDevidingTask = scanner.nextInt();

                double friendsAmountAfterDeviding = friendsAmount / typedNumberForDevidingTask;

                System.out.println("Friends minusing operation is completed!");
                System.out.println("Now you have " + friendsAmountAfterDeviding + " friends");

                System.out.println("If you want to calculate your friends again, then type the right option for you again!");
                System.out.println(continueCalculatingOrNot);

                int choice3 = scanner.nextInt();

                if (choice3 == 1) {

                    System.out.println("You have selected to calculate again!");
                    System.out.println("Continuing...");
                    friendsCalculatorTask();

                } else if (choice3 == 2) {

                    System.out.println("You selected to stop the task!");
                    System.out.println("Stopping");
                }



            } else {
                System.out.println("You have tiped something wrong!");
                System.out.println("Try again");
            }

        } else {
            System.out.println("You have write CORRECT wrong!");
            friendsCalculatorTask();
        }
    }
    // FRIENDS CALCULATOR TASK ----------------------------------------

    // FRIENDS AMOUNT TASK --------------------------------------------
    static void friendsAmountTask() {
        System.out.println("Comming soon...");
    }
    // FRIENDS AMOUNT TASK --------------------------------------------


    // END TASK--------------------------------------------------------
    static void endTask() {
        System.out.println("Comming soon...");

    }
    // END TASK -------------------------------------------------------
}
