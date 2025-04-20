public class EquilibriumIndexOfArray03 {
    public static int findEquIndex(int arr[]){
        int totalsum =0;
        int leftsum =0;

        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int rightsum = totalsum -leftsum-arr[i];
            if(leftsum == rightsum){
                return i;
            }else {
                leftsum += arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, -3, 0,-2,6 };
        int result =findEquIndex(arr);

        if(result != -1){
            System.out.println("Equilibrum index :"+ result);
        }
        else{
            System.out.println("Equilibrum index not found  :"+ result);
        }
    }
}
