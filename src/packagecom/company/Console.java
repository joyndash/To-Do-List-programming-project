package packagecom.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);

    public String readCommand() {
        return scanner.nextLine();
    }

    public void printList(List<String> todoList) {
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM/dd");
        Calendar currentDate = Calendar.getInstance();
        System.out.println("List's Date:" + simpleDate.format(currentDate.getTime()));
        for (String item : todoList
        ) {
            System.out.println(item);
        }
    }

    public void print(String output) {
        System.out.print(output);
    }

    public void println(String output) {
        System.out.println(output);
    }
}
