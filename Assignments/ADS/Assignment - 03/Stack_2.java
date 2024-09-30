class Base {
    int size;
    int top;
    int arr[];

    Base(int n) {
        top = -1;
        size = n;
        arr = new int[size];
    }

    boolean isEmpty() {
        return top == -1; // Corrected to check if top is -1
    }

    boolean isFull() {
        return top == size - 1; // Corrected to check if top is size - 1
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() { // Changed to return the top element
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }
}

public class Stack_2 {

    public static boolean ispar(String s) {
        // Declare a stack to hold the previous brackets.
        Base stk = new Base(s.length());
        for (int i = 0; i < s.length(); i++) {

            // Check if the character is an opening bracket
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if (!stk.isEmpty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']'))) {
                    stk.pop();
                } else {
                    return false; // Unmatched closing bracket
                }
            }
        }

        // If stack is empty, return true (balanced), 
        // otherwise false
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        if (ispar(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
