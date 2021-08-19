import java.util.Arrays;
import java.util.List;

public class FindTotalListItems {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(54,87,61,1,2,5,4,6,8);
        System.out.println("Total list items in the list: " + nums.stream().count());
        // However - the same thing can also be done using Collection.size() but we want to use Java 8 way
    }
}
