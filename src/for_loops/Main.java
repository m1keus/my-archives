package for_loops;

public class Main {
    // В данном случае идет отсчет от 10 до 0, но с интервалом в цифру
    public static void main(String[] args) {

        for(int i = 10; i >= 0; i-=2 ) {
            System.out.println(i);
            // i-=2
            // Можно так же написать тут, но тогда необходимо будет удалить такую же запись сверху
        }

        System.out.println("Happy new year!");
    }
}
