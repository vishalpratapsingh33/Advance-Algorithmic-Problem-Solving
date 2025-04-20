public class KthSmallestInSortedMatrix15 {
    public static int countLessequal(int matrix[][],int mid,int n){
        int count =0;
        int row =n-1;
        int col =0;

        while(row >= 0 && col < n){
            if(matrix[row][col] <= mid){
                count += (row+1);
                col++;
            }
            else{
                row--;

            }
        }
        return count;
    }
    public static int kthSmallest(int matrix[][],int k){
        int n = matrix.length;
        int low = matrix[0][0];
        int high  = matrix[n-1][n-1];

        while(low < high){
            int mid = low +(high - low)/2;
            int count = countLessequal(matrix,mid,n);

            if(count < k){
                low = mid +1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int k=8;
        System.out.println("the k smallest element is :"+kthSmallest(matrix,k));
    }
}
