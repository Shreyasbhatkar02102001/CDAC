import java.util.Scanner;

class Stack{
	
	private int max;
	private int top;
	private int s1[];
	
	Stack(int s){
		top = -1;
		max = s;
		s1 = new int[max];
	}
	
	public boolean isEmpty(){
		return top <= -1;
	}
	
	public boolean isFull(){
		return top >= (max - 1);
	}
	
	public void push(int x){
		if (isFull()){
			System.out.println("Overflow");
		}
		else {
			s1[++top] = x;
		}
	}
	
	public int pop(){
		if (isEmpty()){
			System.out.println("Undeflow");
			return -1;
		}
		else{
			return s1[top--];
		}
	}
	
	public int peek(){
		if (isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		return s1[top];
	}
	
	public void display(){
		if (isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			for (int i = 0; i < top; i++){
				System.out.println(s1[i]);
			}
		}
	}
	

}


class StackApp{

	 public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack s1 = new Stack(n); // Create a stack of the same size as the string

        // Push each character of the string into the stack
        for (int i = 0; i < n; i++) {
            s1.push(str.charAt(i));
        }

        
        for (int i = 0; i < n; i++) {
            char ch = (char) s1.pop(); 
            str.setCharAt(i, ch); 
        }
    }
	
	public static void main(String args[]){
		/*
		System.out.print("Enter : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack s = new Stack(n);
		
		System.out.println("Push  ");
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		System.out.println("Peek : "+ s.peek());
		//s.peek();
		
		System.out.println("Display 1 : ");
		s.display();
		
		System.out.println("Pop and display  :");
		System.out.println(""+ s.pop());
		s.display();
		*/
		
		StringBuffer s = new StringBuffer("CDAC Mumbai");
        reverse(s); // Reverse the string
        System.out.println("Reverse of the string = " + s); 
	}




}