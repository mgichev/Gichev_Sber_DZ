package DZ2.DZ2_1;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main() {

        HashMap<String, Integer> amountMap = new HashMap<>();
        HashSet<String> uniqueSet = new HashSet<>();

        String[] array = new String[] {
                "apple",
                "juice",
                "tomato",
                "banana",
                "apple",
                "banana",
                "pink",
                "yellow",
                "string",
                "type",
                "apple",
                "house",
                "car",
                "apple",
                "abcde"
        };

        for (String el : array) {
            //получаем элемент в мапе или 0, если такого нет
            int amountEl = amountMap.getOrDefault(el, 0);

            //добавляем в мапу для этого элемента его предыдущее количество + 1
            amountMap.put(el, amountEl + 1);

            //добавляем каждый элемент в сет
            uniqueSet.add(el);
        }

        System.out.println("Уникальные элементы");

        //выводим все уникальные элементы
        for (String uniqueString : uniqueSet) {
            System.out.println(uniqueString);
        }

        System.out.println("\nКоличество элементов");

        //выводим количество всех элементов
        for (String key : amountMap.keySet()) {
            int value = amountMap.get(key);
            System.out.printf("Name: %s, Value: %d %n", key, value);
        }


    }
}
