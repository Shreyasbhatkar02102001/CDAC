class DLL {
	Node head;
	class Node{
	
		int data;
		Node prev;
		Node next;
		
		Node (int d)
		{
			data = d;
			prev = null;
			next = null;
		}
	}
	
	
	// insertion in beginning
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		
		if(head != null){
			head.prev = new_node;
		}
	}
	
	void insertAfter(Node prev_node, int new_data)      //  prev_node is jiske aage node insert karna hai uske pichle node ka addess is passed as an argument
	{
		if(prev_node == null)
		{
			System.out.println("Node cannot exist!");
			return;
		}
		
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if (new_node.next != null){
			new_node.next.prev = new_node;
		}
	}
	
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		
		if (head == null)
		{
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null){
			last = last.next;
		}
		last.next = new_node;
		new_node.prev =last;
	}
	
	void display(Node n){
		Node p = null;
		System.out.println("Forward Direction: ");
		while(n != null){
			System.out.print(n.data+" --> ");
			p = n;
			n = n.next;
		}
		System.out.println();
		
		System.out.println("Reverse Direction: ");
		while(p != null){
			System.out.print(p.data+" <-- ");
			p = p.prev;
		}
	}
	
	public static void main(String args[]){
		
		DLL d1 = new DLL();
		d1.insert(12);
		d1.insert(23);
		d1.insert(34);
		d1.insert(45);
		d1.display(d1.head);
		System.out.println();
		d1.insertAfter(d1.head,10);
		System.out.println();
		d1.append(100);
		d1.display(d1.head);
		System.out.println();
		
	}
}