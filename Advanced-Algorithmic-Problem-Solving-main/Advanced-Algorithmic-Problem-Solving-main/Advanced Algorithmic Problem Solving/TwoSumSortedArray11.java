public class TwoSumSortedArray11 {
    public static int[] findSumTwo(int arr[],int target){
        int left =0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return new int[]{arr[left],arr[right]};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 7, 10, 11};
        int target = 9;
        int[] result = findSumTwo(arr, target);
        if (result[0] != -1) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);     //O(n) O(1)
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
