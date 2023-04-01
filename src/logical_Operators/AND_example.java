package logical_Operators;

public class AND_example {
    // Both conditions must be true! (&&)
    public static void main(String[] args) {

        int temp = 25;

        if(temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }
    }
}
