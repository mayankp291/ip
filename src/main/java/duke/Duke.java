package duke;

import duke.manager.TaskManager;

/**
 * TODO : Better Documentation
 *        Add Delete
 *        Add Save
 *        Add more constants
 *        Update Tests
 *        Create more exceptions
 *        Fix commit messages (git convention)
 *        Add checkstyle
 */

public class Duke {
    public static void main(String[] args) {
        welcomeMessage();
        TaskManager.processInput();
        byeMessage();
    }

    /**
     * Prints a welcome message on the console
     */
    private static void welcomeMessage() {
        TaskManager.printLine();
        System.out.println("Howdy there! I'm Fluke");
        System.out.println("What can I do for you today master?");
        TaskManager.printLine();
    }

    /**
     * Prints a bye message on the console
     */
    private static void byeMessage() {
        TaskManager.printLine();
        System.out.println("Bye. Hope to serve you again master!");
        TaskManager.printLine();
    }
}