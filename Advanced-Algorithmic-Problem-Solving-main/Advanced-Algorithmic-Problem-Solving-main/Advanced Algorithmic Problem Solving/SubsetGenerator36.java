import java.util.*;
public class SubsetGenerator36 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        System.out.println("All subsets:");
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
