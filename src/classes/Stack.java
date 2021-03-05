package classes;

// This class defines an integer stack that can hold 10 values.
public class Stack {
    private int stck[];
    private int seq;

    // Initialize top-of-stack
    Stack(int size) {
        stck = new int[size];
        seq = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (seq == stck.length - 1)
            System.out.println("Stack is full.");
        else
            stck[++seq] = item;
    }

    // Pop an item from the stack
    int pop() {
        if (seq < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[seq--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(20);

        // push some numbers onto the stack
        for (int i = 0; i < 11; i++) stack1.push(i);
        for (int i = 10; i < 20; i++) stack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in stack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(stack1.pop());

        System.out.println("Stack in stack2:");
        for (int i = 0; i < 11; i++)
            System.out.println(stack2.pop());

//         these statements are not legal，加入了private，在外部无法直接访问tos
//         stack1.tos = -2;
//         stack2.stck[3] = 100;
    }
}
