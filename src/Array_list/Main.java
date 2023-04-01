package Array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0, "Sushi");
        // 0 Обозначает первую позицию в списке

        food.remove(2);
        // Удаляет обозначенную позицию

        food.clear();
        // Удаляет все позиции



        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
