import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,8,1,3,6,7,4,2);
        List<Integer> resultNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+ resultNumbers);
    }
}
