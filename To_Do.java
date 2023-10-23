import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Options:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as complete");
            System.out.println("3. View tasks");
            System.out.println("4. Remove a task");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.print("Enter the task number to mark as complete: ");
                    int completeTaskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (completeTaskNumber >= 1 && completeTaskNumber <= tasks.size()) {
                        System.out.println("Task '" + tasks.get(completeTaskNumber - 1) + "' marked as complete.");
                        tasks.remove(completeTaskNumber - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the task number to remove: ");
                    int removeTaskNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    if (removeTaskNumber >= 1 && removeTaskNumber <= tasks.size()) {
                        System.out.println("Task '" + tasks.get(removeTaskNumber - 1) + "' removed.");
                        tasks.remove(removeTaskNumber - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
