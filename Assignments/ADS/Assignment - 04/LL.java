class LL{
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	void display(){
		Node temp = head;
		while (temp != null){
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	void addFirst(int data){
		Node newNode = new Node(data);
		size++;
		if (head == null){
			head = tail = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(int data){
		Node newNode = new Node(data);
		size++;
		if (head == null){
			head = tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	void addIndex(int index, int data){
		if (index == 0){
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node prev = head;
		int  i = 0;
		while (i < (index-1)){
			prev = prev.next;
			i++;
		}
		newNode.next = prev.next;
		prev.next = newNode;
	}
	
	void deleteValue(int key){
		Node temp = head, prev = null;
		if (temp != null && temp.data == key){
			head = temp.next;
			size--;
			return;
		}
		//Node temp = head, prev = null;
		while (temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if (temp == null){
			System.out.print("LL is empty");
			return;
		}
		prev.next = temp.next;
		size--;
	}
	
	void deleteIndex(int index){
		Node temp = head, prev = head;
		if (head == null){
			System.out.print("LL is empty");
			return;
		}
		if (index == 0){
			head = temp.next;
			size--;
			return;
		}
		int i = 0;
		while ((i < (index - 1)) && (temp != null)){
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		size--;
	}
	
	boolean search(int data){
		Node temp = head;
		if (temp == null){
			System.out.print("LL is empty");
			return false;
		}
		while (temp != null){
			if (temp.data == data){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static void main(String args[]){
		LL l1 = new LL();
		
		l1.addFirst(12);
		l1.addFirst(23);
		l1.addLast(34);
		l1.addLast(45);
		l1.display();
		l1.addIndex(2,99);
		l1.display();
		System.out.println(l1.search(99));
		
		l1.deleteIndex(1);
		l1.deleteValue(99);
		l1.display();
	}
	
}