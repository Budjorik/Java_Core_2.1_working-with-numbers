package ru.netology.lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Получаем ArrayList из чисел
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Сортируем ArrayList
        Collections.sort(intList);

        // Применяем к ArrayList последовательно ряд операций
        for (Integer count : intList) {
            if (count <= 0 ) continue;
            if (count % 2 != 0) continue;
            System.out.println(count);
        }

    }
}
