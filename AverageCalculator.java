public class AverageCalculator {
    public static void main(String[] args) {
        int a = 123;
        int b = 532;
        int avg = (a/2+b/2 + (a%2 + b%2)/2);

        System.out.println("avg = " + avg);

    }
}
