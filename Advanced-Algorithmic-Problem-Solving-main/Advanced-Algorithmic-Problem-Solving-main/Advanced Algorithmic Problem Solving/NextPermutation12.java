import java.util.*;
public class NextPermutation12 {
    public static void nextpermutation(int arr[]){
        int n= arr.length;
        int i=n-2;

        while(i<=0 && arr[i]>= arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int arr[],int start,int end){
        while(start < end){
            swap(arr,start++,end--);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        nextpermutation(arr);
        System.out.println("The next permutation is : "+ Arrays.toString(arr));
    }
}
