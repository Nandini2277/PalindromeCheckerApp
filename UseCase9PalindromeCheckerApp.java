public class UseCase9PalindromeCheckerApp {
    private static boolean check(String s, int start, int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return check(s, start+1, end-1);
    }
    UseCase9PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(9.0);
        String input = "madam";
        boolean result = check(input, 0, input.length()-1);
        if(result) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase9PalindromeCheckerApp();
    }
}
