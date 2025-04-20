public class MaxXORofTwoNo23 {
        TrieNode root = new TrieNode();
        private void insert(int num) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }
        private int findMaxXOR(int num) {
            TrieNode node = root;
            int maxXor = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggledBit = 1 - bit;
                if (node.children[toggledBit] != null) {
                    maxXor |= (1 << i);
                    node = node.children[toggledBit];
                } else {
                    node = node.children[bit];
                }
            }
            return maxXor;
        }

        public int findMaximumXOR(int[] nums) {
            int maxXor = 0;

            for (int num : nums) {
                insert(num);
            }

            for (int num : nums) {
                maxXor = Math.max(maxXor, findMaxXOR(num));
            }

            return maxXor;
        }

        public static void main(String[] args) {
            MaxXORofTwoNo18 solver = new MaxXORofTwoNo18();
            int[] nums = {3, 10, 5, 25, 2, 8};
            System.out.println("Maximum XOR: " + solver.findMaximumXOR(nums));
        }



}
