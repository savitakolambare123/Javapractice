import java.util.*;

public class TreeSetNumbersApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // TreeSet auto-sorts numbers

        // Step 1: Add initial n numbers
        System.out.print("How many numbers do you want to add initially? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        int choice;
        // Step 2: Menu-driven operations
        do {
            System.out.println("\n--- TREESET MENU ---");
            System.out.println("1. Add Number");
            System.out.println("2. View Numbers");
            System.out.println("3. Delete Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int num = sc.nextInt();
                    if (numbers.add(num)) {
                        System.out.println("Number added successfully!");
                    } else {
                        System.out.println("Number already exists (TreeSet avoids duplicates).");
                    }
                    break;

                case 2:
                    System.out.println("\nNumbers in sorted order:");
                    if (numbers.isEmpty()) {
                        System.out.println("No numbers found.");
                    } else {
                        int i = 1;
                        for (int e : numbers) {
                            System.out.println(i++ + ". " + e);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter number to delete: ");
                    int del = sc.nextInt();
                    if (numbers.remove(del)) {
                        System.out.println("Number deleted successfully!");
                    } else {
                        System.out.println("Number not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
