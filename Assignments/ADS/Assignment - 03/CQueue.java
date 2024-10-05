class CQueue{
	int max;
	int arr[];
	int front, rear;
	
	CQueue(int size){
		this.max = size;
		arr = new int[max];
		front = rear = -1;
	}
	
	boolean isEmpty(){
		 return front == -1;
	}
	
	boolean isFull(){
		 return ((rear + 1 ) % max ) == front;
	}
	
	void enqueue(int data){
		if (isFull()){
			System.out.println("Queue is full");
			return;
		}
		if (front == -1){
			front = 0;
		}
		rear = (rear + 1) % max;
		arr[rear] = data;
		System.out.println(data +" is inserted");
	}
	
	int dequeue(){
		if (isEmpty()){
			System.out.println("Queue is EmptyBorder");
			return -1;
		}
		if (front == rear){
			front = rear = -1;
		}
		else{
			front = (front + 1) % max;
		}
		int val = arr[front];
		return val;
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Queue is EmptyBorder");
			return ;
		}
		int i = front;
		while (i != rear){
			System.out.print(arr[i] + " ");
			i = (i+1) % max;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		CQueue q1 = new CQueue(5);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(7);
		
		//q1.display();
		
		q1.dequeue();
		q1.enqueue(8);
		
		q1.display();
	}
}