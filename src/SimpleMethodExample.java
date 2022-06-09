public class SimpleMethodExample {

    public static int doMath(int num1, int num2, int num3) {
        return num1 + (num2 * num3);
    }

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int total = doMath(num1,num2,num3);

        System.out.println(total);



    // location of the main method inside a class can be anywhere inside
    // the main method.
    // only one main method per class
    // order of the statements do matter.








    }
}
