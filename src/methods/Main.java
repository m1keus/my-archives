package methods;

public class Main {
    public static void main(String[] args) {

        String name = "m1keus";
        int age = 18;

        hello(name, age);

    }

    static void hello(String anyName, int anyAge) {
        // Обычно добавлять static не нужно, но для работы этого кода - нужно

        System.out.println("Hello! " + anyName);
        System.out.println("You are " + anyAge + " years old!");

        // Не обязатьельно нужно писать name, можно написать любое другое слове, как например тут используется anyName, но оно должно совпадать с содержимым этого метода

    }
}
