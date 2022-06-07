import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        String cohort = "Go";
        System.out.printf("Hello, %s%n", cohort); // needs another argument
    //substitute %s with the argument 'cohort'

    // imported java.util.Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
//        System.out.println("Hello, " + name);
        System.out.printf("Hello, %s", name);

        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        System.out.println("You entered " + userInput);

        String first;
        String second;

        System.out.println("Please enter a sentence: ");
        String ghost = scanner.nextLine();
        first = scanner.nextLine();
        System.out.println("Please enter another sentence: ");
        second = scanner.nextLine();
        System.out.println("First sentence: " + first + "\n second sentence: " + second);

    }
}
