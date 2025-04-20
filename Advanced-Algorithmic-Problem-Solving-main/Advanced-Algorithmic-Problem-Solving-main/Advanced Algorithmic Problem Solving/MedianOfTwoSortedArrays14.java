public class MedianOfTwoSortedArrays14 {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length)
                return findMedianSortedArrays(nums2, nums1);

            int n1 = nums1.length;
            int n2 = nums2.length;
            int low = 0, high = n1;

            while (low <= high) {
                int i = (low + high) / 2;
                int j = (n1 + n2 + 1) / 2 - i;

                int left1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
                int right1 = (i == n1) ? Integer.MAX_VALUE : nums1[i];

                int left2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
                int right2 = (j == n2) ? Integer.MAX_VALUE : nums2[j];

                if (left1 <= right2 && left2 <= right1) {
                    if ((n1 + n2) % 2 == 0) {
                        return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                    } else {
                        return Math.max(left1, left2);
                    }
                } else if (left1 > right2) {
                    high = i - 1;
                } else {
                    low = i + 1;
                }
            }

            throw new IllegalArgumentException("Arrays are not sorted correctly.");
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 3};
            int[] nums2 = {2};
            System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));  // Output: 2.0
        }



}
