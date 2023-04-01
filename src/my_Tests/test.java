package my_Tests;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your friends amount");
        int friendsAmount = scanner.nextInt();


        System.out.println("you have " + friendsAmount + " friends");

        scanner.close();

    }
}
