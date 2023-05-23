import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Вывести список задач");
            System.out.println("4. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите задачу: ");
                    scanner.nextLine(); // очистка буфера
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    System.out.println("Задача добавлена");
                    break;

                case 2:
                    System.out.print("Введите индекс задачи: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index - 1);
                    System.out.println("Задача удалена");
                    break;

                case 3:
                    toDoList.printTasks();
                    break;

                case 4:
                    System.out.println("Программа завершена");
                    System.exit(0);

                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
