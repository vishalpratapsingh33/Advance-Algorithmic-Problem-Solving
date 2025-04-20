public class MajorityElement16 {
    public static int findMajorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int i=0;i<arr.length;i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count = count + 1;
            } else {
                count = count - 1;
            }

        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(arr)); // Output: 2
    }
}
