class Stack_min{
	int top;
	int size;
	int arr[];
	int arr2[];
	
	Stack_min(int size){
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == this.size-1;	
	}
	
	void push(int data){
		if (isFull()){
			throw new IllegalStateException("Stack is Full");
			return;
		}
		arr[++top] = data;
		if (top == 0 || data < (peek())){
			arr2[top] = data;
 		}
	}
	
	int pop(){
		if (isEmpty()){
			throw new IllegalStateException("Stack is Empty");
			return -1;
		} 
		return arr[top--];
	}
	
	int peek(){
		if (isEmpty()){
			throw new IllegalStateException("Stack is Empty");
			return -1;
		} 
		return arr[top];
	}
	
	int getMin(){
		System.out.println("Min value from stack : "+ arr2[top]);
	}
	
	public static void main(String args[]){
		Stack_min s1 = new Stack_min(5);
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		s1.getMin();
	}

}