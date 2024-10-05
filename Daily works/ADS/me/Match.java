import java.util.Scanner;
class Match{

int max;
    int top;
    char arr[];

    // Constructor to initialize the stack
    Match(int size) {
        this.max = size;
        this.top = -1;
        arr = new char[max];
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Push an element onto the stack
    void push(char data) {
        arr[++top] = data;
    }

    // Pop an element from the stack
    char pop() {
        return arr[top--];
    }

    // Peek at the top element of the stack
    char peek() {
        return arr[top];
    }

    // Method to check if brackets are balanced
    static boolean bracket(String s) {
        int n = s.length();
        Match m1 = new Match(n);
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                m1.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (m1.isEmpty()) {
                    return false;  // Closing bracket without matching opening bracket
                } else if ((m1.peek() == '(' && c == ')') ||
                           (m1.peek() == '{' && c == '}') ||
                           (m1.peek() == '[' && c == ']')) {
                    m1.pop();
                } else {
                    return false;  // Mismatched brackets
                }
            }
        }
        return m1.isEmpty();  // If stack is empty, all brackets were matched
    }




    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());  // Read the number of strings
        String srr[] = new String[n];
        for (int i = 0; i < n; i++) {
            srr[i] = sc.nextLine();  // Read each string
        }

        for (int i = 0; i < n; i++) {
            System.out.println(bracket(srr[i]));  // Check each string
        }
        sc.close();
    }
}