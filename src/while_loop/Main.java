package while_loop;

import java.util.Scanner;
public class Main {
    // Данная структура будет повторять запрос, пока в поле не появится какая-либо запись
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
    }
}
