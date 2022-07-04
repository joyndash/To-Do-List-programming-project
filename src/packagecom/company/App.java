package packagecom.company;

import java.util.List;

public class App {

    private static boolean isViewListCommand(String command) {
        return command.equals("!view");
    }

    public static void main(String[] args) {
        Console console = new Console();
        TodoListManager todoListManager = new TodoListManager();
        // printing usage instructions for user
        console.println("ToDoList creator-create to do lists using java.");
        console.println("Type '!view' to exit and view your list.");
        console.println("Enter your tasks in the line below.");

        while (true) {
            console.print(":");
            String command = console.readCommand();
            if (isViewListCommand(command)) {
                List<String> todoList = todoListManager.getList();
                console.printList(todoList);
                break;
            } else {
                todoListManager.add(command);
            }
        }
    }
}








