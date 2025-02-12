import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim().toLowerCase(); // Trim spaces and convert to lowercase

        if (input.isEmpty()) {
            System.out.println("You entered an empty string.");
        } else {
            char firstChar = input.charAt(0);
            
            if (!Character.isLetter(firstChar)) {
                System.out.println("The first character '" + firstChar + "' is not a letter.");
            } else if ("aeiou".indexOf(firstChar) != -1) {
                System.out.println("The first character '" + firstChar + "' is a vowel.");
            } else {
                System.out.println("The first character '" + firstChar + "' is a consonant.");
            }
        }

        scanner.close(); // Close the Scanner
    }
}
