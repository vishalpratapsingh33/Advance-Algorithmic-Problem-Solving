public class KadaneAlgorithm41 {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int num : arr) {
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is: " + maxSubArraySum(arr));
    }
}
