public class UseCase3PalindromeCheckerApp {
    UseCase3PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(3.0);
        String word = "madam";
        String reverse ="";
        for(int i=word.length()-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        if(reverse.equals(word)) System.out.println(word+" is a palindrome");
        else System.out.println(word+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase3PalindromeCheckerApp();
    }
}
