import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("You get a wristband.");
        }
        scanner.close();
    }
}
