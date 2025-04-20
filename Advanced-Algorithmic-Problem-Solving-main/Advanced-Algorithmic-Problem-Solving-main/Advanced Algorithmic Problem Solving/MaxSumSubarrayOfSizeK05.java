public class MaxSumSubarrayOfSizeK05 {
    public static int Maxsubarray(int arr[],int k){
        if(arr.length < k){
            System.out.println("Window size k is largest than arr.length");
            return -1;
        }
        int maxsum =0;
        int windowsum =0;

        for(int i=0;i<k;i++){
            windowsum += arr[i];
        }
        maxsum = windowsum;
        for(int i=k;i<arr.length;i++){
            windowsum = windowsum - arr[i-k]+arr[i];
            maxsum = Math.max(maxsum,windowsum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k=2;
        System.out.println("The max sum of Subarrays of size k :"+Maxsubarray(arr,k));   //O(n)  O(1)
    }
}
