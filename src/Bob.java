import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // capture user input
        System.out.println("Hi Bob");
        String userInput = sc.nextLine(); // Get use input(text)

        // ends with an question
        if(userInput.endsWith("?")){
            System.out.println("Sure");
        }
        // ends with a exclamation
        else if (userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }
        // empty
        else if (userInput.trim().equals("")){
            System.out.println("Fine, be that way.");
        // else
        } else {
            System.out.println("Whatever.");
        }
    }
}
