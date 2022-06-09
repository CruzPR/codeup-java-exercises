public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(doPlusMath(1, 2));
        System.out.println(doMinusMath(4,6));
        System.out.println(doMultiplicationMath(68, 32));
        System.out.println(doDivisionMath(10,100));
    }
    public static int doPlusMath(int num1, int num2) {
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
