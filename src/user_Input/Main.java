package user_Input;

import java.util.Scanner;
// Перед работой со сканнером, необходимо его импортировать

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Необходимо написать для активации сканера

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        // В случае когда нужно написать какое то слово

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        // В случае когда нужно написать цифровое значение

        scanner.nextLine();
        // Если ранее в коде использовался scanner.nextLine(), то необходимо написать его для обнуления сканнера

        System.out.println("what is your favourite food?");
        String food = scanner.nextLine();
        // В случае когда нужно написать какое то слово

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favourite food is " + food);
    }
}
