
class CQueue{
	
	int size;
	int arr[];
	int front,rear;
	
	CQueue(int size){
		this.size = size;
		this.front = this.rear = -1;
		this.arr = new int[size];
	}
	
	boolean isEmpty(){
		return front == -1;
	}
	
	boolean isFull(){
		return ((rear + 1) % size ) == front;
	}
	
	void enqueue(int data){
		
		if (isFull()){
			System.out.println("Queue is Full");
			return;
		}
		
		if (front == -1){
			front = 0;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
	}
	
	int dequeue() {
		
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		if (front == rear){
			front = rear = -1;
		}
		else{
			front = (front + 1) % size;
		}
		int val = arr[front];
		return val;
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return ;
		}
		int i = front;
		while (i <= rear){
			System.out.print(arr[i] + " --- ");
			i = (i+1) % size;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		CQueue q1 = new CQueue(10);
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(3);
		q1.enqueue(3);
		q1.enqueue(3);
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
	}
	

}