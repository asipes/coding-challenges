package org.solutions.shortcut;

import java.util.*;
import java.util.stream.Collectors;

public class StreamLearn {
    // Вычислить сумму всех элементов в списке (Medium)
    public int solution4(List<Integer> arr) {
        return arr.stream()
                .mapToInt(num -> num).sum();
    }

    // Сгруппировать строки по их длине используя Collectors.groupingBy (Medium)
    public Map<Integer, List<String>> solution5(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    // Найти максимальный элемент в списке (Medium)
    public int solution6(List<Integer> arr) {
        return arr.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("Empty list"));
    }

    // Раскрыть список списков в простой список (Medium-Hard)
    public List<Integer> solution7(List<List<Integer>> arr) {
        return arr.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    // Вычислить частоту каждого слова в списке или сколько раз каждое слово поворяется в списке (Hard)
    public Map<String, Integer> solution8(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.summingInt(s -> 1)
                ));
    }

    // Имеется список чисел, найти второй самый большой элемент в списке Find Second Largest Element (Hard)
    public int solution9(List<Integer> arr) {
        return arr.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Empty list"));
    }

    // Найти самое длинное слово в предложении (Very Hard)
    public String solution9(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new NoSuchElementException("Empty string"));
    }
}
