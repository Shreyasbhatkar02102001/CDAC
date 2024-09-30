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
		return top == -1;
	}
	
	public boolean isFull(){
		return top == (max - 1);
	}
	
	public void push(int x){
		if (isFull()){
			System.out.println("Overflow");
		}
		else {
			s1[++top] = x;
		}
	}
	
	public void pop(){
		if (isEmpty()){
			System.out.println("Undeflow");
		}
		else{
			s1[top--];
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
			for (int i = 0; i < s1.length; i++){
				System.out.println(s1[i]);
			}
		}
	}
	

}


class StackApp{

	
	public static void main(String args[]){
		System.out.print("Enter : ");
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(n);
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println();
		s.peek(4);
		
		System.out.println();
		s.display();
		
		System.out.println();
		s.pop();
		s.display();
	}




}