public class StringPermutations10 {
    private static void swap(char[] arr, int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void permute(char[] str,int left,int right){
        if(left == right){
            System.out.println(new String(str));
        }
        else{
            for(int i=left;i<=right;i++){
                swap(str,left,i);
                permute(str,left+1,right);
                swap(str,left,i);

            }
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permute(str.toCharArray(), 0, str.length() - 1);
    }
}
