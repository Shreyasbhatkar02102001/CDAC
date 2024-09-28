

class Queue{
	
	int size = 5;
	int a[] = new int [size];
	int front, rear;
	
	Queue(){
		
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		
		return (front == -1);
	}
	
	boolean isFull(){
		
		return (rear == size-1);
	}
	
	void enqueue(int x){
		
		if (isFull()){
			System.out.println("Queue is full");
		}
		else {
			
			if (front == -1){
				front = 0;               /// set front to 0 if queue is empty
			}
			rear++;
			a[rear] = x;
			System.out.println(x + " Inserted");
		}
	}
	
	int dequeue(){
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int x = a[front];
			System.out.println(x+ " Deleted");
			if (front > rear)
			{
				front = -1;
				rear = -1;
			}
			else{
				front++;
			}
			return x;
		}
	
	}
	
	
	/*
	int dequeue(){
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int temp = a[front];
		
		for (int i = 0; i < rear; i++){
			a[i] = a[i+1];
		}
		rear--;
		return temp;
		
	} */
	
	void peek(){
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}
		
		System.out.println(a[0]);
	}
	
	void display(){
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			System.out.println("Queue elements : ");
			
			for (int i = front; i <= rear; i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
		}
	}
	

	

	public static void main(String args[]){
	
		Queue q1 = new Queue();
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		
		//q1.peek();
		q1.display();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
		
	}
}