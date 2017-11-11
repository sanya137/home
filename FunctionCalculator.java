import java.util.Scanner;

public class FunctionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("f(x) = "+ Math.log(Math.sin(x) + (Math.pow(Math.E, x) * Math.sqrt(x) / Math.PI)));

        scanner.close();
    }
}
