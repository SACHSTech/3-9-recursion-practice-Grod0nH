package recursion;

public class PowerFunction {

    public static int power(int base, int expo){

        if (expo < 1){
            return 1;
        }

        return base * power(base, expo-1);

    }

    public static void main(String[] args){
        System.out.println(power(2, 3));
    }
    
}
