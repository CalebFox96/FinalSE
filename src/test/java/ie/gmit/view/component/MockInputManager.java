package ie.gmit.view.component;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

public class MockInputManager extends InputManager {
    private final PrintStream output;

    public MockInputManager(PrintStream output) {
        super(new ByteArrayInputStream("".getBytes()), output);
        this.output = output;
    }


    int nextInt = 0;
    String nextLine = "";

    public void setNextInt(int next) {
        this.nextInt = next;
    }

    @Override
    public int getInputInt(String message) {
        output.print(message);
        return nextInt;
    }

    public void setNextString(String next) {
        this.nextLine = next;
    }

    @Override
    public String getInputString(String message) {
        output.print(message);
        return nextLine;
    }
}
