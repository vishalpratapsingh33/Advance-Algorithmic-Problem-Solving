import java.util.*;
public class PermutationGenerator38 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private static void backtrack(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) permutation.add(num);
            result.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            backtrack(nums, index + 1, result);
            swap(nums, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        List<List<Integer>> permutations = permute(input);
        System.out.println("All permutations:");
        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
}

