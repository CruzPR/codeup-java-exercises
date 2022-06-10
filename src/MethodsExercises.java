public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(doPlusMath(1, 2));
        System.out.println(doDoublePlusMath(53333,56666));
        System.out.println(doMinusMath(4,6));
        System.out.println(doMultiplicationMath(68, 32));
        System.out.println(doDivisionMath(10,100));
    }
    public static int doPlusMath(int num1, int num2) {
        return num1 + num2;
    }
    public static double doDoublePlusMath(double num1, double num2) {
        return num1 + num2;
    }
    public static int doMinusMath(int num1, int num2) {
        return num1 - num2;
    }
    public static int doMultiplicationMath(int num1, int num2) {
        return num1 * num2;
    }
    public static int doDivisionMath(int num1, int num2) {
        return num1 / num2;














    }
}

// TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
//  a greeting message to the user by either their first or first and last name.

// example: sayName("Justin") - "Hi Justin"
// example: sayName("Justin", "Reich") - "Hi Justin Reich"

// TODO: overload the addition method from the curriculum exercise to both add integers and add doubles

//    public static  String sayName(String name) {
//        return "Hi " + name;
//    }
//    public static String sayName(String name1, String name2) {
//        return "Hi " + name1 + " " + name2;
//    }
