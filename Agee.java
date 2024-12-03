import java.util.Scanner;

public class Agee {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your birth year (YYYY): ");
            int birthYear = scanner.nextInt();

            int currentYear = java.time.Year.now().getValue();

            if (birthYear > currentYear) {
                System.out.println("Birth year cannot be in the future!");
            } else {
                int age = currentYear - birthYear;
                System.out.println("You are " + age + " years old.");
            }
        }
    }
}
