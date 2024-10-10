
class RLL{
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node head;
	Node tail;
	
	void addFirst(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	void addAfter(int key, int data){
		Node newNode = new Node(data);
		Node trav = head;
		while(trav != null && trav.data != key){
			trav = trav.next;
		}
		if (trav == null){
			return;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}
	
	void addBefore(int key, int data){
		Node newNode = new Node(data);
		Node trav = head;
		while(trav.next != null && trav.next.data != key){
			trav = trav.next;
		}
		if (trav.next == null){
			return;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}
	
	void deleteNode(int key){
		Node trav = head;
		Node prev = null;
		while(trav != null && trav.data != key){
			prev = trav;
			trav = trav.next;
		}
		if (trav == null){
			return;
		}
		prev.next = trav.next;
	}
	
	void deleteNodeAfter(int key){
		Node trav = head;
		while(trav != null && trav.data != key){
			trav = trav.next;
		}
		if (trav == null){
			return;
		}
		trav.next = trav.next.next;
	}
	
	void display(){
		Node trav = head;
		while (trav != null){
			System.out.print(trav.data+" --> ");
			trav = trav.next;
		}
		System.out.println("Null");
	}
	
	Node reverse( Node n )
	{
		// Node n = head;             ---> given parameter is head
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while ( current != null )
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return n;
	}
	
	public static void main(String args[]){
		RLL l1 = new RLL();
		l1.addFirst(2);
		l1.addFirst(1);
		l1.addLast(3);
		l1.addLast(4);
		l1.display();
		l1.addBefore(3,99);
		l1.addAfter(99, 89);
		l1.display();
		l1.deleteNode(99);
		l1.deleteNodeAfter(2);
		l1.display();
		l1.reverse(l1.head);
		l1.display();
	}
	
}