package for_each_loop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //String animals[] = {"cat", "dog", "rabbit", "bird"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        animals.add("bird");

        for(String i : animals) {
            System.out.println(i);

        }

    }
}
