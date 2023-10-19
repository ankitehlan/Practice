package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
        HashSet<Integer> items = new HashSet<>();
        System.out.println(list.stream().filter(p-> !items.add(p)).collect(Collectors.toSet()));
    }
}
