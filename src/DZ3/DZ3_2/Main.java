package DZ3.DZ3_2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = CollectionUtils.newArrayList();
        List<Integer> arr2 = CollectionUtils.newArrayList();
        List<Integer> arr3 = CollectionUtils.newArrayList();
        List<Integer> arr4 = CollectionUtils.newArrayList();

        arr.add(5);
        arr.add(20);
        arr.add(5);

        arr3.add(5);
        arr4.add(30);
        arr2.add(10);

        System.out.println("Дана исходная коллекция");
        System.out.println("добавление в коллекцию 5 20 5, сначала элемент 5, потом список из одного элемента 10");
        CollectionUtils.add(arr, 5);
        CollectionUtils.addAll(arr2, arr);
        System.out.println(arr);

        System.out.println("поиск первого элемента по значению");
        System.out.println("Поиск 20 в массиве 5 20 5 5 10 = " + CollectionUtils.indexOf(arr, 20));
        System.out.println("Поиск -5 в массиве 5 20 5 5 10 = " + CollectionUtils.indexOf(arr, -5));

        System.out.println("срез по элементам");
        System.out.println("Срез до 2 (начиная с нуля) в массиве 5 20 5 5 10 = " + CollectionUtils.limit(arr, 2));

        System.out.println("удаление коллекции элементов из 5 20 5 5 10 удаляется коллекция 5");
        CollectionUtils.removeAll(arr, arr3);
        System.out.println(arr);

        System.out.println("проверка на наличие элементов");
        System.out.println("Все элементы из набора 20 10 в наборе 10 " + CollectionUtils.containsAll(arr, arr2));
        System.out.println("Любой элемент из набора 20 10 в наборе 10 " + CollectionUtils.containsAny(arr2, arr));

        List<Integer> arr5 = CollectionUtils.newArrayList();
        arr5.add(1);
        arr5.add(2);
        arr5.add(3);
        arr5.add(4);


        System.out.println("проверка на включение элементов 1 2 3 4 в отрезок от 2 до 3, разные сигнатуры функции");
        System.out.println(CollectionUtils.range(arr5, 2, 3));
        System.out.println(CollectionUtils.range(arr5, 2, 3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;
                else if (o1.equals(o2))
                    return 0;
                else
                    return -1;
            }
        }));
    }
}
