import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the 1st angle");
        double angle1 = scanner.nextDouble();

        System.out.println("Please, enter the 2nd angle");
        double angle2 = scanner.nextDouble();

        System.out.println("Please, enter the 3rd andgle");
        double angle3 = scanner.nextDouble();

        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("It is a valid triangle");
        } else {
            System.out.println("It is not a valid triangle.");
        }
    }
}
