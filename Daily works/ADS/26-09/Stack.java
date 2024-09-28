

class Stack{

	static final int max = 10;
	int top ;
	int a[] = new int [max];
	
	Stack(){
	
		top = -1;
	}
	
	boolean isEmpty(){
		
		return (top < 0);
	}
	
	boolean push(int x){
		
		if (top > (max-1)){
			System.out.println("Overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}
	
	int pop(){
	
		if (top < 0){
			System.out.println("Underflow");
		}
		return a[top--];
	}
	
	int peek(){
	
		if (isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return a[top];
	}
	
	void display(){
		
		if (isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			System.out.println("Stack elements are : ");
			show(top);
			System.out.println();
		}
		
	}
	
	void show(int index){
		
		if (index < 0){
			return;
		}
		else{
			System.out.println(a[index]+" ");
			show(index-1);
		}
	}

	public static void main(String args[]){
	
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		s1. display();
		
		s1.pop();
		s1. display();
		
	}
}