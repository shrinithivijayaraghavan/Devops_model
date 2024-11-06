import java.util.Scanner;

public class devops {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        
        // Read the user's name
        String name = scanner.nextLine();
        
        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the Java application.");
        
        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
