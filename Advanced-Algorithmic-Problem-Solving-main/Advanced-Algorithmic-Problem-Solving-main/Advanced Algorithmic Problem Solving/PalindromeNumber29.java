public class PalindromeNumber29 {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int[] testCases = {121, 12321, 10, -121, 0, 1221};

        for (int num : testCases) {
            System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
        }
    }
}
