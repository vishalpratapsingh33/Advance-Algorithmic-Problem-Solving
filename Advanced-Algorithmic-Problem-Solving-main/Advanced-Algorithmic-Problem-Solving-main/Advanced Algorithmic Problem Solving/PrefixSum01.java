public class PrefixSum01 {
        public static int[] findprefixsum(int arr[]){
            int prefix[] = new int[arr.length];
            prefix[0] = arr[0];

            for(int i=1;i<arr.length;i++){
                prefix[i] = prefix[i-1]+arr[i];
            }
            return prefix;
        }
        public static void main(String[]args){
            int arr[] = {1, 3, 5, 7, 9};

            int prefix[] = findprefixsum(arr);
            System.out.println("prefix sum"+" ");
            for(int i=0;i<prefix.length;i++){
                System.out.print(prefix[i]+" ");
            }

        }

// The prefix sum of an array is a new array where each element at index i is the sum of all elements from the start of the array up to index i.
// Time: O(n)
// Space: O(n)
}
//Ranjan Kumar 
