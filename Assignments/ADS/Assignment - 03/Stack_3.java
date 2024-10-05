import java.util.Scanner;
class Stack_3{

	private int max;
	private int top;
	private int arr[];
	
	Stack_3(int size){
		this.max = size;
		this.top = -1;
		this.arr = new int[max];
	}
	
	boolean isEmpty(){
		return top <= -1;
	}
	
	boolean isFull(){
		return top >= max-1;
	}
	
	void push(int data){
		if (isFull()){
			System.out.println("Stack is full");
			return;
		}
		arr[++top] = data;
	}
	
	int pop(){
		if (isEmpty()){
			System.out.println("Stack is Emoty");
			return -1;
		}
		return arr[top--];
	}
	
	void show(int index)
	{
		if(index < 0 )//base condition
			return;
		System.out.println(arr[index] + "");
		show(index-1);//recursive call
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Stack is Emoty");
			return ;
		}
		else{
			System.out.println("Stack elements are:");
			show(top);
			System.out.println();
		}
	}
		
	
	static int evaluatePostfix(String s){
		int n = s.length();
		Stack_3 s1 = new Stack_3(n);
		
		for (int i = 0; i < n; i++){
			char c = s.charAt(i);
			if (Character.isDigit(c)){
				s1.push(c - '0');
			}
			else{
				int val1 = s1.pop();
				int val2 = s1.pop();
				
				switch(c){
					case '+':
						s1.push(val2 + val1);
						break;
					
					case '-':
						s1.push(val2 - val1);
						break;
					
					case '*':
						s1.push(val2 * val1);
						break;
					
					case '/':
						s1.push(val2 / val1);
						break;
				}
			}
		}
		return s1.pop();
	}
		
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s = s1.replaceAll("\\s","");
		System.out.println(evaluatePostfix(s));
		sc.close();
	}
	
}