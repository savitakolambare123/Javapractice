import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
    
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== SIMPLE CALCULATOR ===");

        while (true) {
            System.out.println("\n1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 5) {
                System.out.println("Exiting application. Goodbye!");
                break; 
            }

            if (choice >= 1 && choice <= 4) {
                numbers.clear(); 

                System.out.print("Enter first number: ");
                numbers.add(scanner.nextDouble());
                
                System.out.print("Enter second number: ");
                numbers.add(scanner.nextDouble());
                scanner.nextLine(); 

                
                double num1 = numbers.get(0);
                double num2 = numbers.get(1);

                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));
                } 
                else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));
                } 
                else if (choice == 3) {
                    System.out.println("Result: " + (num1 * num2));
                } 
                else if (choice == 4) {
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                }
            } 
            else {
                System.out.println("Invalid choice! Please select 1, 2, 3, 4, or 5.");
            }
        }
        scanner.close();
    }
}
