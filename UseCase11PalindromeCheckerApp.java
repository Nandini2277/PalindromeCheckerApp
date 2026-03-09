class PalindromeService{
    public boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length()-1;
        while(start<end){
        if(input.charAt(start)!=input.charAt(end)) return false;
        start++;
        end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    UseCase11PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(11.0);
        String input = "madam";
        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);
        if(result) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase11PalindromeCheckerApp();
    }
}
