package ie.gmit.view.component;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputManager {

    private Scanner scanner;
    private PrintStream output;

    public InputManager(InputStream input, PrintStream output) {
        this.output = output;
        scanner = new Scanner(input);
    }

    public int getInputInt(String message) {
        do {
            try {
                String data = getInputString(message);
                return Integer.parseInt(data);
            } catch (NumberFormatException e) {
                output.println("Please enter valid number");
            }
        } while (true);
    }

    public String getInputString(String message) {
        String input = "";
        do {
            try {
                output.print(message);
                input = scanner.nextLine();
                return input;
            } catch (Exception e) {
                output.println("Please enter valid data");
            }
        }
        while (true);
    }
}
