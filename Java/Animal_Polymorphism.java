import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));

                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }

                result.append(" ");
            }
        }

        System.out.println("Result: " + result.toString().trim());

        scanner.close();
    }
}
