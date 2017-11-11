import java.util.Scanner;

public class SimpleAboutMeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your surname: ");
        String surname = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("I`m "+ name +" "+ surname +",  "+ age +" years old");

        scanner.close();

    }
}
