public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 13579;
        int m = 10000;
        for (int i = 0; i < 5; i++) {
            int dp = (n / m) % 10;
            m = m / 10;

            System.out.println(dp);


        }
    }
}
