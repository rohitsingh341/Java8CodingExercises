import java.util.Arrays;
import java.util.List;

public class FindMaxNumberFromAList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,6,3,8,7,9,54,8,54);
        int maxNum = nums.stream().max(Integer::compare).get(); // Integer::compareTo can also be used - but it calls compare() method ultimately
        System.out.println("Maximum number found is : " + maxNum);

    }
}
