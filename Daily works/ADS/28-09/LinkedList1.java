class LinkedList1{

	Node head;
	class Node{
		int data;	
		Node next;
	
		Node (int d)

		data 1= d;
		next = null;
	}
	
	void display()
	{
		Node n = head;
		while (n != null )
		{
			System.out.print(n.data + " ---> ");
			n = n.next;
		}
	}
	
	// for first node insertion
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);   ///  new node is creaed and data is assigned
		new_node.next = head;                  ///  linking is done between nodes
		head = new_node;                           //  now head node will be pointing new_node
	}
	
	// for insertion in-between 
	void insertafter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_date);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public static void main(String args []){
		
		
		LinkedList1 11 = new LinkedList1();
		11.head = new Node(10);
	
		Node Second =  new Node(20);   // creating node 
		Node Thired = new Node(30);    //  creating and data assignin
	
		l1.head.next = second;          // linking nodes head to second node
		Second.next = third;            //  //  linkning second node to third node
		
		l1.display();
		System.out.println();
		l1.insert(40);
		l1.insert(50);
		l1.display();
		System.out.println();
		
		l1.insertafter(l1.head, 60);
		l1.display();
		System.out.println();
		
		l1.insertafter(l1.head.next, 100);
		l1.display();
		System.out.println();
		
	}
}
	