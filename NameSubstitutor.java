import java.util.Scanner;

public class NameSubstitutor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message: ");
        String message = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println(message.replace("${name}", name));
    }

}
