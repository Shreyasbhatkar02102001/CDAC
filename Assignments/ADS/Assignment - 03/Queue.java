class Queue{
	int max;
	int arr[];
	int front, rear;
	
	Queue(int size){
		max = size;
		arr = new int[max];
		front = rear = -1;
	}
	
	boolean isEmpty(){
		 return front == -1;
	}
	
	boolean isFull(){
		 return rear == max-1;
	}
	
	void enqueue(int data){
		if (isFull()){
			System.out.println("Queue is full");
			return;
		}
		if (front == -1){
			front = 0;
		}
		arr[++rear] = data;
		System.out.println(data +" is inserted");
	}
	
	int dequeue(){
		if (isEmpty()){
			System.out.println("Queue is EmptyBorder");
			return -1;
		}
		int val = arr[front];
		if (front > rear){
			front = rear = -1;
		}
		else{
			front++;
		}
		return val;
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Queue is EmptyBorder");
			return ;
		}
		for (int i = front; i <= rear; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Queue q1 = new Queue(4);
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		
		//q1.display();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
	}
}