import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        
        double bmi = weight / (height * height);

        if (bmi < 0) {
            System.out.println("Error: Height and weight must be positive values.");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
