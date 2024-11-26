package recursion;

public class SumofDigits {
    public static int sumofDigits(int n) {
        if (n == 0){
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumofDigits(1234)); 
    }
}
