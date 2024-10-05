
class Queue{

	int size ;
	int arr[];
	int front, rear;
	
	Queue(int size){
		this.size = size;
		arr = new int[size];
		front = rear = -1;
	}
	
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return rear == size-1;
	}
	
	void enqueue(int data){
		
		if (isFull()){
			System.out.println("Queue is Full");
			return;
		}
		if(front == -1)
		{
			front = 0;// set front to 0 if queue is empty
		}
		arr[++rear] = data;
		System.out.println(data + " inserted");
	}
	
	int dequeue(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		int x = arr[front];
		if (front > rear){
			front = rear = -1;
		}
		else{
			front++;
		}
		return x;
	}
	
	void display(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return ;
		}
		else{
			System.out.println("Queue Elements : ");
			for (int i = front; i <= rear; i++){
				System.out.print(arr[i] +" --- ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[]){
		Queue q1 = new Queue(5);
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		
		q1.dequeue();
		q1.dequeue();
		
		q1.display();
	}
}