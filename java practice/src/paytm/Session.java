package paytm;

import java.util.Stack;
public class Session {
    public static void main(String[] args) {

        /*
        Design custom stack which supports three operations:
        1. push - adds element on top of stack
        2. pop - removes element from top of stack
        3. getMinimum - returns minimum element among the elements present in the stack

        All these 3 operations should have O(1) time complexity.

        Sample input/output:
        push(4)
        push(6)
        push(0)
        push(7)

        getMinimum() - 0

        pop() - 7
        pop() - 0

        getMinimum() - 4
         */


    }
}

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int x) {
        mainStack.push(x);
        // If minStack is empty or new element is smaller/equal, push to minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop element from stack
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int removed = mainStack.pop();
        // If removed element is the current minimum, pop from minStack too
        if (removed == minStack.peek()) {
            minStack.pop();
        }
        return removed;
    }

    // Get minimum element in O(1)
    public int getMinimum() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return minStack.peek();
    }

    // For demonstration
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(4);
        stack.push(6);
        stack.push(0);
        stack.push(7);

        System.out.println("getMinimum() - " + stack.getMinimum()); // 0

        System.out.println("pop() - " + stack.pop()); // 7
        System.out.println("pop() - " + stack.pop()); // 0

        System.out.println("getMinimum() - " + stack.getMinimum()); // 4
    }
}
