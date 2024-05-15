import java.util.*;

public class StackExample {
    private Deque<Integer> stack;

    public StackExample() {
        stack = new ArrayDeque<>();
    }


    public void push(int element) {
        stack.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();


        stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);


        System.out.println("Popped element: " + stackExample.pop());
        System.out.println("Popped element: " + stackExample.pop());
        System.out.println("Popped element: " + stackExample.pop());
    }
}
