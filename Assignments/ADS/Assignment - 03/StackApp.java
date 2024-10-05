import java.util.Scanner;
class Stack{
	
	private int max;
	private int top;
	private int arr[];
	private int actualSize;
	
	Stack(int size){
		this.max = size;
		this.top = -1;
		arr = new int[max];
	}
	
	boolean isEmpty(){
		return top <= -1;
	}
	
	boolean isFull(){
		return top >= max-1;
	}
	
	void push(int data){
		if(isFull()){
			System.out.println("Overflow");
			return;
		}
		actualSize++;
		arr[++top] = data;
	}
	
	int pop(){
		if (isEmpty()){
			System.out.println("UnderFlow");
			return -1;
		}
		actualSize--;
		return arr[top--];
	}
	
	int peek(){
		if (isEmpty()){
			System.out.println("UnderFlow");
			return -1;
		}
		return arr[top];
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Stack is Empty");
			return ;
		}
		int i = 0;
		while (i < actualSize){
			System.out.println(arr[i]);
			i++;
		}
		System.out.println();
	}

}

class StackApp{
	
	public static void reverse(StringBuffer str){
		int n = str.length();
		Stack s1 = new Stack(n);
		for (int i = 0; i < n; i++){
			s1.push(str.charAt(i));
		}
		
		for (int i = 0; i < n; i++){
			char ch = (char) s1.pop();
			str.setCharAt(i, ch);
		}
	}
	
	public static void main(String args[]){
		/*
		Stack s1 = new Stack(10);
		
		s1.pop();
		s1.display();
		
		s1.push(23);
		s1.push(34);
		s1.push(45);
		s1.push(56);
		
		s1.display();
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		System.out.println(s1.peek());
		
		s1.push(67);
		s1.display();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		StringBuffer str = new StringBuffer(s);
		reverse(str);
		System.out.print("Reverse String : "+str);
	}
}