package random_numbers;

import java.util.Random;
public class randomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6) + 1;
        /* Генерация чисел в данном случае ограничена с 0 до 5, для того, чтобы учитывалось число, которые вы написали в скобках необходимо добавить значение + 1 */

        double y = random.nextDouble();
        /* Рандомное число от 0 до 1 */

        boolean z = random.nextBoolean();
        /* Случайная генерация ответов true или false */


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
