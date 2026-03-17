/**
 * Key Concepts:
 * 1. Default Values: Providing a fallback value when no input is given
 * 2. Command-line Arguments: Accessing user input via args[] parameter
 * 3. Conditional Statements: Using if to check conditions
 * 4. Boolean Logic: Using logical conditions to control flow
 * 5. Array Length: Checking the number of command-line arguments
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}