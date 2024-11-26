package recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if (s.length() <= 1){
            return true;
        }


        if (s.charAt(s.length() - 1) != s.charAt(0)){
            return false;
        }

        return isPalindrome(s.substring(1, s.length()-1));


    }

    public static void main(String[] args){
        System.out.println(isPalindrome("bob"));
    }
    
}
