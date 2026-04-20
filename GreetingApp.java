public class HelloApp {
    public static void main(String[] args) {
        StringBuilder greetingBuilder = new StringBuilder("Hello");
        
        // Check if arguments are provided
        if (args.length == 0) {
            // No arguments provided
            greetingBuilder.append(", World!");
        } else {
            // Arguments provided
            greetingBuilder.append(", ");
            
            // Iterate through args using enhanced for loop
            for (String name : args) {
                greetingBuilder.append(name).append(", ");
            }
            
            // Remove trailing comma and space using substring()
            String greetingWithDelimiter = greetingBuilder.toString();
            greetingBuilder = new StringBuilder(
                greetingWithDelimiter.substring(0, greetingWithDelimiter.length() - 2)
            );
            
            greetingBuilder.append("!");
        }
        
        // Print the greeting
        System.out.println(greetingBuilder.toString());
    }
}