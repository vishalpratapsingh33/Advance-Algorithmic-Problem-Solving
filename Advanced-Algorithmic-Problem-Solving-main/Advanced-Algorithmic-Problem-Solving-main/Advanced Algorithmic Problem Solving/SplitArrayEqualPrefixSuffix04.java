public class SplitArrayEqualPrefixSuffix04 {
    public static boolean canSplit(int arr[]){
        int totalsum =0;
        for(int  i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
        int leftsum = 0;
        for(int i=0;i<arr.length-1;i++){
            leftsum += arr[i];
            int rightsum = totalsum -leftsum;
            if(leftsum  == rightsum){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4};
        System.out.println(canSplit(arr));
    }


}
