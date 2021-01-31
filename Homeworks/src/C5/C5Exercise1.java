package C5;

import java.util.ArrayList;
import java.util.Arrays;

public class C5Exercise1 {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<String>(Arrays.asList("bread", "water", "milk", "butter", "chesse"));

        System.out.println(shoppingList.size());

        shoppingList.add(2,"oil");
        shoppingList.add("bananas") ;
        shoppingList.add("water");
        System.out.println(shoppingList);

        System.out.println(shoppingList.size());

        System.out.println(shoppingList.contains("oil"));
        System.out.println(shoppingList.contains("beans"));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.indexOf("water"));
        System.out.println(shoppingList.lastIndexOf("water"));
        shoppingList.remove("water");
        shoppingList.remove(6);
        System.out.println(shoppingList);

        shoppingList.set(3,"water");
        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList);




    }
}
