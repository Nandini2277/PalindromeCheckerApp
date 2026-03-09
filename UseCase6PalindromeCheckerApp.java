import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PalindromeCheckerApp {
    UseCase6PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(6.0);
        String input = "civic";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList();
        boolean isPalindrome = true;
        for(char c : input.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        while(!queue.isEmpty()){
            char qRem = queue.remove();
            char sPop = stack.pop();
            if(qRem==sPop) continue;
            else {
                isPalindrome = false; 
                break;
            }
        }
        if(isPalindrome) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase6PalindromeCheckerApp();
    }
}
