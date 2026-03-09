import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    UseCase5PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(5.0);
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        for(char c : input.toCharArray()){
            char popp = stack.pop();
            if(popp==c) continue;
            else isPalindrome = false;
        }
        if(isPalindrome) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase5PalindromeCheckerApp();
    }
}
