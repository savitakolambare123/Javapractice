import java.util.*;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Show Number of Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    todoList.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total tasks: " + todoList.size());
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
