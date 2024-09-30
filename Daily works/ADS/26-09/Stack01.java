// Online Java Compiler
// Use this editor to write, compile and run your Java code online


public class Stack{
	
	int size;
	int top;
	int arr[];
	
	Stack(int n){
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
	


	public static void main(String args[]){
		Stack s1 = new Stack(5);
		
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		System.out.print("Popped elemetn from an stack : "+s1.pop());
		
		s1.peek();
	}
}