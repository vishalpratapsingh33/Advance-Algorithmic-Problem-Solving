public class RangeOfPrefixSum02 {
    public static int[] prefixsum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] =arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int rangeOfPrefixsum(int prefix[],int left,int right){
        if(left == right){
            return prefix[right];
        }
        return prefix[right] -prefix[left-1];
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int prefix[] = prefixsum(arr);

        int left =1 , right =2;
        int sum = rangeOfPrefixsum(prefix, left, right);

        System.out.println("Sum from index " + left + " to " + right + " is: " + sum);

    }
}
