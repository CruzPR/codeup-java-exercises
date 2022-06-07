import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in); // terminal input
//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered %d%n", userInput);

//        System.out.println("Please enter three words: ");
//        for (int i = 0; i < 3; i++) {
//            String userInput = scanner.next();
//            System.out.printf("%s%n", userInput);   // Instead of doing this 3 times (for loop helped).
//        }
//
//        System.out.println("Enter a single sentence: ");
//        String userInput = scanner.next();
//        System.out.printf("%s%n", userInput);

        System.out.println("Enter classroom length: ");
        String length = scanner.nextLine();
        System.out.println("Enter classroom width: ");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        System.out.printf("Your classroom is %d%n", perimeter);

    }
}
