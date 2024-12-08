package DZ3.DZ3_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CountMapImpl<Integer> arr = new CountMapImpl<>();
        arr.add(50);
        arr.add(50);
        arr.add(50);
        arr.add(20);

        int count = 0;

        System.out.println("Проверка добавлений элементов и getCount в коллекции 50 50 50 20");
        count = arr.getCount(20);
        System.out.println("Поиск кол-ва 20 = " + count);
        count = arr.getCount(30);
        System.out.println("Поиск кол-ва 20 = " + count);

        System.out.println("Проверка удалений элементов в коллекции 50 50 50 20");
        count = arr.remove(50);
        System.out.println("Удаление элемента 50 = " + count);
        count = arr.remove(50);
        System.out.println("Повторное удаление элемента 50 = " + count);

        System.out.print("Проверка размера всей коллекции ");
        count = arr.size();
        System.out.println(count);

        CountMapImpl<Integer> arr2 = new CountMapImpl<>();
        arr2.add(30);
        arr2.add(30);

        System.out.println("Проверка добавления коллекции");
        System.out.println("Количество повторений элемента 30 в  коллекции 20 = " + arr.getCount(30));
        arr.addAll(arr2);
        count = arr.getCount(30);
        System.out.println("Количество элемента 30 после добавления в предыдущею коллекцию 30 30 = " + count);

        System.out.println("Вид предыдущей коллекции в виде map = " + arr.toMap());
        Map<Integer, Integer> map = new HashMap<>();
        arr.toMap(map);
        System.out.print("Добавили map в другую пустую коллекцию, в результате ");
        System.out.println(map);
    }
}
