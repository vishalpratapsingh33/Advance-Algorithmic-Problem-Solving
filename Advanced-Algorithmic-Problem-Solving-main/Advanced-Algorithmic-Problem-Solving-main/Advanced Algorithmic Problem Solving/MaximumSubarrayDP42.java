//Dynamic Programming is a technique for solving problems that involve breaking down a problem into smaller subproblems and storing the solutions to these subproblems to avoid redundant computations
public class MaximumSubarrayDP42 {
    public static int maxSubArraySum(int[] arr) {
        int n = arr.length;
        if (n == 0){
            return 0;
        }
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(arr));
    }
}
