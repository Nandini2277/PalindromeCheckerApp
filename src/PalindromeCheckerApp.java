import java.util.Scanner;

/**
 * UseCase10: Case-Insensitive & Space-Ignored Palindrome Validation
 * Description: Validates a palindrome after preprocessing to ignore spaces and case. [cite: 16]
 * Version: 10.0 [cite: 24]
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Use Case 10: Normalized Palindrome Validation ---");
        System.out.print("Input: ");
        String input = scanner.nextLine(); // Example: "A man a plan a canal Panama" [cite: 39]

        // 1. Normalize string: Remove non-alphanumeric and convert to lowercase [cite: 6, 9, 18, 19]
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Apply logic: Compare characters from both ends [cite: 7, 32, 33]
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters [cite: 35, 36]
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output results [cite: 40]
        System.out.println("Normalized String: " + normalized);
        System.out.println("Is Palindrome?: " + isPalindrome);

        scanner.close();
    }
}