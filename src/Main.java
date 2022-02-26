import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayOfNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (int number : arrayOfNumbers) {
            if (number > 0 && number % 2 == 0) {
                result.add(number);
            }
        }
        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        for (int elem : result) {
            sb
                    .append(elem)
                    .append("\n");
        }
        System.out.println(sb);
    }
}
