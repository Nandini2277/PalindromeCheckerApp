import java.util.*;

public class UseCase2PalindromeCheckerApp {
    UseCase2PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(2.0);
        String word = "madam";
        int start = 0;
        int end = word.length()-1;
        boolean isPalindrome = true;
        while(start<end){
            if(word.charAt(start) == word.charAt(end)){
                start++;
                end--;
            }else{
                isPalindrome = false;
            }
        }
        if(isPalindrome){
                System.out.println(word+" is a palindrome.");
        }else{
                System.out.println(word+" is not a palindrome.");
        }
    }
    public static void main(String[] args){
        new UseCase2PalindromeCheckerApp();
    }
}
