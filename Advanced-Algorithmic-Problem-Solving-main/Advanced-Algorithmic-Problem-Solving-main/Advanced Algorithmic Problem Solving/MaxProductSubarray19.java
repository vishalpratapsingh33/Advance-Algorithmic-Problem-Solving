public class MaxProductSubarray19 {

        public static int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) return 0;

            int maxProduct = nums[0];
            int currMax = nums[0];
            int currMin = nums[0];

            for (int i = 1; i < nums.length; i++) {
                int temp = currMax;

                if (nums[i] < 0) {
                    int swap = currMax;
                    currMax = currMin;
                    currMin = swap;
                }

                currMax = Math.max(nums[i], currMax * nums[i]);
                currMin = Math.min(nums[i], currMin * nums[i]);

                maxProduct = Math.max(maxProduct, currMax);
            }

            return maxProduct;
        }

        public static void main(String[] args) {
            int[] nums = {2, 3, -2, 4};
            System.out.println("Maximum Product Subarray: " + maxProduct(nums));
        }


}
