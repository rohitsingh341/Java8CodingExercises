import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberFromList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(54,87,32,91);
        nums.stream().findFirst().ifPresent(System.out::println);
    }
}
