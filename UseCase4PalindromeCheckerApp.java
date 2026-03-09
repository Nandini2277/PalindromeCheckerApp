public class UseCase4PalindromeCheckerApp {
    UseCase4PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(4.0);
        String word = "madam";
        int start = 0;
        int end = word.length()-1;
        char[] wordArray = word.toCharArray();
        boolean isPalindrome = true;
        while(start<end){
            if(wordArray[start]==wordArray[end]){
                start++;
                end--;
            }else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println(word + " is a palindrome");
        else System.out.println(word + " is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase4PalindromeCheckerApp();
    }
}
