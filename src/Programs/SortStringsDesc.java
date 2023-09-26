package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Sort strings in descending
 * Input = ["Apple", "Banana", "Kiwi", "Pineapple"]
 * Output = ["Pineapple", Kiwi, "Banana", "Apple"]
 */

public class SortStringsDesc {
    public static void main(String[] args) throws Exception{
        List<String> fruits = Arrays.asList("Apple", "Banana", "Kiwi", "Pineapple");

        fruits.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::print);;
    }
}