
public class Practice {
    int[] stack = new int[5]; // Stack with a fixed size of 5
    int top = 0; // Top points to the next free position

    // Push method to add an element to the stack
    public void push(int number) {
        if (top == stack.length) { // Check for stack overflow
            System.out.println("Stack Overflow! Cannot push " + number);
        } else {
            stack[top] = number;
            top++;
            System.out.println("Pushed: " + number);
        }
    }

    // Pop method to remove an element from the stack
    public void pop() {
        if (top == 0) { // Check for stack underflow
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            top--;
            int popped = stack[top];
            System.out.println("Popped: " + popped);
        }
    }

    // Method to display the stack
    public void display() {
        if (top == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i < top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Practice stack = new Practice();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); // Attempt to pop from an empty stack
    }
}
