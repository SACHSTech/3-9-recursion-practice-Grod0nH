package recursion;

public class Array {
    public static int sumArray(int[] arr, int n){
        if (n == 0){
            return 0;
        }
        return arr[n-1] + sumArray(arr, n-1);
    }
    public static void main(String[] args){
        System.out.println(sumArray(new int[] {1, 5, 4}, 3));
    }
}
