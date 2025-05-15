package StackAndQueues.Part1;

public class Stack {
    static int top = -1; // Global top variable

    // Push operation
    static void push(int stack[], int n) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = n;
    }

    // Pop operation
    static void pop(int[] stack) {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + stack[top]);
        top--;
    }

    // Display current stack elements
    static void display(int[] stack) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        int stack[] = new int[10];

        push(stack, 5);
        push(stack, 3);
        push(stack, 9);
        display(stack);

        pop(stack);
        display(stack);
    }
}

