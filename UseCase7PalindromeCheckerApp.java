import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {
    UseCase7PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(7.0);
        String input = "refer";
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray()){
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while(deque.size()>1){
            char f = deque.removeFirst();
            char l = deque.removeLast();
            if(f==l) continue;
            else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase7PalindromeCheckerApp();
    }
}
