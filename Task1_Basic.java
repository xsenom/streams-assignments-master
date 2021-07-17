package tasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Task1_Basic {





    /**
     * Функция должна вернуть количество четных чисел в списке.
     *
     * Пример:
     *  0,2 -> 2
     *  1,2,3,5 -> 1
     *
     * Тут подойдут эти методы:
     *    - Collection::stream()
     *    - Stream::filter()
     *    - Stream::count()
     */
    static long countEven(Collection<Integer> numbers) {

        return numbers.stream().filter(n->n%2 == 0).count();
    }

    /**
     * Функция должна вернуть число строчных символов в строке.
     *
     * Пример:
     *  "abcDE" -> 3
     *  "ABC" -> 0
     *
     * Тут подойдут эти методы:
     *    - String::chars()
     *    - Character::isLowerCase()
     *    - Stream::count()
     */
    static long countLowercaseLetters(String str) {
        return str.chars()
                .filter(Character::isLowerCase).count ();
    }


    /**
     * Функция должна заменить каждое слово в строке его длинной.
     *
     * Слова разделяются одним или более пробелами.
     *
     * Пример:
     *   "a b cd" -> "1 1 2"
     *   "one two   three" -> "3 3 5"
     *
     * Тут подойдут эти методы:
     *    - String::split()
     *    - Stream::map()
     *    - Stream::collect()
     *    - Collectors.joining()
     */
    static String replaceWordsOnLength(String str) {

        return Arrays.stream(str.split("\\s+"))
                .mapToInt(String::length)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));


    }
}
