import java.util.HashMap;
public class SubarraySumEqualsK34 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0, count = 0;

        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println("Number of subarrays with sum = " + k + ": " + subarraySum(nums, k));
    }
}

