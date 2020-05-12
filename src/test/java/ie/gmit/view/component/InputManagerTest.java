package ie.gmit.view.component;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputManagerTest {

    private InputManager inputManager;
    private ByteArrayInputStream input;
    private ByteArrayOutputStream output;

    public void setup(String userInput) {
        input = new ByteArrayInputStream(new String(userInput + "\n").getBytes());
        output = new ByteArrayOutputStream();
        inputManager = new InputManager(input, new PrintStream(output));
    }

    @Test
    public void test_getInputString_shouldPrintMessage_and_returnUserInput() {
        String userInput = "I input this";
        String message = "please input : ";
        setup(userInput);

        String inData = inputManager.getInputString(message);

        assertEquals(userInput, inData);
        assertEquals(message, output.toString());
    }
}