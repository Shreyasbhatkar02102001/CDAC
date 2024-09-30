// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Base{
	int size;
	int top;
	int arr[];
	
	Base(int n){
		top = -1;
		size = n;
		arr = new int[size];
	}
	
	boolean isEmpty(){
		return top == size-1;
	}
	
	boolean isFull(){
		return size == size-1;
	}
	
	void push(int x){
		
		if (isFull()){
			System.out.println("Overflow");
			return;
		}
		arr[++top] = x;
	}
	
	int pop(){
	
		if (isEmpty()){
			System.out.println("Underflow");
			return -1;
		}
		return arr[top--];
	}
	
	void peek(){
		if (isEmpty()){
			System.out.println("Underflow");
			return;
		}
		int temp = top;
		while (temp >= 0){
			System.out.println("\n___");
			System.out.println(arr[temp]);
			temp--;
		} 
	
}

public class Stack_2{
	
	public static boolean ispar(String s) {  
        // Declare a stack to hold the previous brackets.
        Base stk = new Base(str.length());
        for (int i = 0; i < s.length(); i++) {
          
            // Check if the character is an opening bracket
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i)); 
            } 
            else {
              
                // If it's a closing bracket, check if the stack is non-empty
                // and if the top of the stack is a matching opening bracket
                if (!stk.empty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']'))) {
                    stk.pop(); 
                }
                else {
                    return false; // Unmatched closing bracket
                }
            }
        }
      
        // If stack is empty, return true (balanced), 
        // otherwise false
        return stk.empty();
    }

    public static void main(String[] args) {
        String s = "{()}[]";
        if (ispar(s))
            System.out.println("true");
        else
            System.out.println("false");
    }


	public static void main01(String args[]){
		Stack s1 = new Stack(5);
		
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		System.out.print("Popped elemetn from an stack : "+s1.pop());
		
		s1.peek();
	}
}