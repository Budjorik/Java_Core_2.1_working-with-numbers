package ru.netology.lesson1;

import java.util.*;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args) {
        // Получаем ArrayList из чисел
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Получаем поток из массива целых чисел
        // К потоку применяем ряд промежуточных операций
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
