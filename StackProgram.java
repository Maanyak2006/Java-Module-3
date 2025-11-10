import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        // Create a stack to hold student names
        Stack<String> studentNames = new Stack<>();

        // Push five student names onto the stack
        studentNames.push("Alice");
        studentNames.push("Bob");
        studentNames.push("Charlie");
        studentNames.push("David");
        studentNames.push("Eve");

        // Display the initial stack
        System.out.println("Initial stack: " + studentNames);

        // Pop one name from the stack
        String poppedName = studentNames.pop();
        System.out.println("Popped name: " + poppedName);

        // Display the remaining stack
        System.out.println("Remaining stack: " + studentNames);
    }
}
