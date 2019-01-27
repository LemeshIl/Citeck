package citeck;

import java.util.*;

public class Solve1 {


    /**
     * 1.Имеется массив чисел, получить список вида {число, количество вхождений числа в массив},
     * список должен быть отсортирован по количеству вхождений, внутри по возрастания числа.
     * Использовать можно любой алгоритмический язык.
     */

    public void sortArray(int[] arr) {
        System.out.println("Задача-1");
        System.out.println("имеется массив :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("отсортированный список :");
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                count++;
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        List<Integer> listKey = new ArrayList<>(map.keySet());
        Set<Integer> setValue = new TreeSet<>(map.values());
        List<Integer> listValue = new ArrayList<>(setValue);
        int i = 0;
        int j = 0;
        while (i < listValue.size()) {
            while (j < listKey.size()) {
                if (listValue.get(i).equals(map.get(listKey.get(j)))) {
                    System.out.print("{" + listKey.get(j) + ",");
                    System.out.println(map.get(listKey.get(j)) + "}");
                }
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println();
    }
}
