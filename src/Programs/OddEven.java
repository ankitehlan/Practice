package Programs;
// input [3,5,8,2,10]

// output [3O,5O,8E,2E,10E]

// input [2,4,0,43,0,9,7,0]
// output out: [2,4,43,9,7,0,0,0]

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OddEven {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = Arrays.asList(3,5,8,2,10,9);
        Consumer<Integer> operation = i -> {
            if(i%2 == 0) {
                System.out.println(String.valueOf(i).concat("E"));
            } else {
                System.out.println(String.valueOf(i).concat("O"));
            }
        };

        numbers.stream().forEach(operation);
    }
}
