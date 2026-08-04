import java.util.Scanner;  // Import Scanner class for user input

class problem 1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
        
        System.out.print("Enter a string: ");  // Prompt user to enter a string
        String str = sc.nextLine();  // Read the entire line as input
        
        // Create a StringBuffer object with the input string
        StringBuffer sb = new StringBuffer(str);
        
        // Reverse the string using StringBuffer's reverse() method
        String rev = sb.reverse().toString();
        
        // Check if the original string and reversed string are equal (ignoring case)
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("String is a palindrome");  // If yes, print palindrome message
        } else {
            System.out.println("String is not a palindrome");  // Otherwise, print not palindrome
        }
        
        sc.close();  // Close the Scanner object to free resources
    }
}
