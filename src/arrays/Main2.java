package arrays;

public class Main2 {
    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }


    }
}
