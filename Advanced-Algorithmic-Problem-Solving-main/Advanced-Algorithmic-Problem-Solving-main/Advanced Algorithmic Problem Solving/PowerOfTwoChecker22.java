public class PowerOfTwoChecker22 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 6;

        System.out.println(num1 + " is power of two? " + isPowerOfTwo(num1));
        System.out.println(num2 + " is power of two? " + isPowerOfTwo(num2));
    }
}
