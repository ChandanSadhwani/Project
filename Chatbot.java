import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How can I assist you today?");
        
        while (true) {
            String userInput = scanner.nextLine();
            String botResponse = getBotResponse(userInput);
            System.out.println(botResponse);
            
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Goodbye! Have a nice day.");
                break;
            }
        }
        
        scanner.close();
    }
    
    public static String getBotResponse(String input) {
        String response;
        
        // Simple bot responses based on user input
        if (input.equalsIgnoreCase("hi") || input.equalsIgnoreCase("hello")) {
            response = "Hello there!";
        } else if (input.equalsIgnoreCase("how are you?")) {
            response = "I'm doing well, thank you!";
        } else if (input.equalsIgnoreCase("what's your name?")) {
            response = "I am a Chatbot.";
        } else {
            response = "I'm sorry, I don't understand.";
        }
        
        return response;
    }
}
