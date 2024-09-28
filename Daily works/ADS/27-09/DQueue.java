

class DQueue{
	
	int size = 5;
	int a[] = new int [size];
	int front, rear;
	
	
	DQueue(){
		
		front = -1;
		rear = 0;
	}
	
	boolean isEmpty(){
		
		return (front == -1);
	}
	
	boolean isFull(){
		
		return ((front == 0 && rear == size-1) || front == rear+1);
	}
	
	void enqueue(int key){
		
		if (isFull()){
			System.out.println("Queue is full");
		}
		// first element inserted 
		if (front == -1)
		{
			front = 0;
			rear = 0;
		}
		else if ( front == 0)
			front = size -1;
		else 
			front = front - i;
		a[front] = key;
	}
	
	void insertrear(int key){
		
		if (isFull()){
			System.out.println("Full !");
			return;
		}
		if ( front == -1 ){
			
			front = 0;
			rear = 0;
		}
		else if (front == size-1) {
			
			rear = 0;
		}
		else 
			rear = rear + 1;
		a[front] = key;
	}
	
	void deleterear(){
		
		if (isEmpty()){
			System.out.println("Empty !");
			return;
		}
		if ( front == rear ){
			
			front = -1;
			rear = -1;
		}
		else if (rear == 0) {
			
			rear = 0;
		}
		else 
			rear = rear + 1;
		a[front] = key;
	}
	
	int getfront(){
		
		if (isEmpty() || rear < 0){
			System.out.println(""Empty !);
			return;
		}
		return a[front];
	}
	
	void display(){
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			System.out.println("Queue elements : ");
			int i = front;
			while ( i != rear ){
				System.out.println(a[i]+ " ");
				i = ( i + 1 ) % size;
			}
			System.out.println(a[rear]);
			System.out.println();
			
		}
	}
	
	/*
			for (int i = front; i != rear; i = (i+1) % size )
			{
				
			}
	*/
	

	public static void main(String args[]){
	
		CircularQueue q1 = new CircularQueue();
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		
		//q1.peek();
		q1.display();
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
		
	
		
	}
}