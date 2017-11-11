public class DifferentRadixSummator {
    public static void main(String args[]) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter X in Bin: ");
        int x = scanner.nextInt(2);
        System.out.println("Enter Y in Oct : ");
        int y = scanner.nextInt(8);
        System.out.println("Enter Z in Hex: ");
        int z = scanner.nextInt(16);
        System.out.println(x + y + z);
        scanner.close();
    }
}