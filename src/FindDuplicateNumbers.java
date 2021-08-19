import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,6,8,3,7,4,9,5,1,6);
        Set<Integer> numSet = new HashSet<>();
        List<Integer> duplicateNums = nums.stream().filter(num -> !numSet.add(num)).collect(Collectors.toList());

        System.out.println("Duplicate numbers: " + duplicateNums);
    }

}
