package Array_list_2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coca cola");
        drinksList.add("sprite");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        // Если записать groceryList.get(0) - покажет только тот список, который указан в индексе
        // Если записать groceryList.get(0).get(0) - покажет только тот список, который указан в индексе и только то содержанание, которое указано в индексе

    }
}
