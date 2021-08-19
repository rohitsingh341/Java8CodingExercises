import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,13,5,66,19);
        List<Integer> newNumbers = numbers.stream()
                .map(num -> num + "")
                .filter(numStr -> numStr.startsWith("1"))
                //.map(numStr -> Integer.valueOf(numStr)) this is replaced with method reference feature of java 8- BELOW
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + newNumbers);
    }

}
