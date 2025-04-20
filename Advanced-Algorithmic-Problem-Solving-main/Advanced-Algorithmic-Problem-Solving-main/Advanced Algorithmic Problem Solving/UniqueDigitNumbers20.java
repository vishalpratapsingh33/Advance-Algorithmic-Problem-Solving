public class UniqueDigitNumbers20 {
        public static int countNumbersWithUniqueDigits(int n) {
            if (n == 0) return 1;
            if (n > 10) n = 10;

            int total = 10;
            int uniqueDigits = 9;
            int available = 9;

            for (int i = 2; i <= n; i++) {
                uniqueDigits *= available;
                total += uniqueDigits;
                available--;
            }

            return total;
        }

        public static void main(String[] args) {
            int n = 2;
            System.out.println("Count of unique digit numbers for n = " + n + ": " + countNumbersWithUniqueDigits(n));
        }

}
