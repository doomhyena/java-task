import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Todo Lista ---");
            System.out.println("1. Új feladat hozzáadása");
            System.out.println("2. Feladatok megjelenítése");
            System.out.println("3. Feladat eltávolítása");
            System.out.println("4. Kilépés");
            System.out.print("Válassz egy opciót: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Kérlek, számot adj meg: ");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println("Szia!");
                    break;
                default:
                    System.out.println("Érvénytelen opció! Próbáld újra.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Add meg a feladat szövegét: ");
        scanner.nextLine();
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Feladat hozzáadva!");
    }

    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("A todo lista üres.");
        } else {
            System.out.println("\n--- Feladatok ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("Nincs eltávolítható feladat.");
            return;
        }

        displayTasks();
        System.out.print("Add meg az eltávolítani kívánt feladat számát: ");

        int taskNumber;
        while (!scanner.hasNextInt()) {
            System.out.print("Kérlek, számot adj meg: ");
            scanner.next();
        }
        taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Feladat eltávolítva!");
        } else {
            System.out.println("Érvénytelen szám!");
        }
    }
}