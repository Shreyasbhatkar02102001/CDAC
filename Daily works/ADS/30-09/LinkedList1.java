class LinkedList1{

	Node head;
	class Node{
		int data;	
		Node next;
	
		Node (int d)
		{
			data = d;
			next = null;
		}
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
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;                  //  alaways coonect right side first becoz we may lose right side memeroy of linkedlist
		prev_node.next = new_node; 
	}
	
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if (head == null){ 
			head = new Node(new_data);                   // if list doesn't exist head will point to new_node
			return;
		}
		
		Node last = head;
		while ( last.next != null )
		{
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	void deleteNode(int key)
	{
		Node temp = head, prev = null;
		
		// deletion at beginning
		if ( temp != null && temp.data == key )       // Checks whether head is empty and checks whether key matches the temp.data 
		{
			head = temp.next;
			return;
		}
		
		// deletion in-between & last node
		while ( temp != null && temp.data != key )
		{
			prev = temp;
			temp = temp.next;
		}
		
		// Non-existing element
		if ( temp == null )
		{
			return;
		}
		
		prev.next = temp.next;
	}
	
	
	
	
	
	public static void main(String args []){
		
		
		LinkedList1 l1 = new LinkedList1();
		l1.head = new Node(10);
	
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

/*   first create a linkedlist

    ------------------------------------------------
--> To count the number of nodes in a linkedlist <--
	------------------------------------------------
	int count(){
		
		Node temp = head;
		int c = 0;
		while( temp != null )
		{
			c++;
			temp = temp.next;
		}	
	}
	
	------------------------------------
	same in Recursion to count nodes
	------------------------------------
	
	int countRec(Node node)
	{
		// Node node = head;
		// Base
		if ( node == null )
		{
			return 0;
		}
		return 1+countRec(node.next);
	}
	
	countRec(head);
	
	
	-----------------------------------------
	Search an element in a linkedlist
	-----------------------------------------
	
	search(Node head, int x)    // int x = 9  --> Search element
	{
		Node n = head;
		while ( n != null )       // till list doesn't end
		{
			if ( n.data == x )        // match current data of node with search element 
			{
				return true;
			}
			n = n.next;                    // assign address of next node 
		}
		return false;
	}
	
	
	-----------------------------------------
	Reverse a linked list     ==  important 
	-----------------------------------------
	
	Node reverse( Node n )
	{
		// Node n = head;
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while ( current != null )
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return n;
	}
	
	-------------------------------------------
	Print middle element of the linked list 
	-------------------------------------------
	
	void middlepoint()
	{
		Node ptr1;  //  slowpointer
		Node ptr2;  //  fastpointer
		
		while ( ptr1 != null && ptr2 != null )
		{
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			System.out.print(ptr1.data + " ---> ");
		}
		
	}
	
	
	--------------------------------------------
	Detect a Loop in LenkedList 
	--------------------------------------------
	
	boolean detectLoop( Node head )
	{
		Node slow = head, fast = head;
		
		while( fast != null && fast.next != null )
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if ( slow == fast )
			{
				return true;
			}
		}
		return false;
	}
	
	
	----------------------------------------------
	Merge two sorted linked list 
	----------------------------------------------
	
	Node merge( Node l1, node l1 )
	{
		if ( l1 == null )
			return l2;
		if ( l2 == null )
			return l1;
		
		if ( l1.data < l2.data )
		{
			l1.next = merge( l1.next, l2 );
			return l1;
		}
		else {
			l2.next = merge( l1, l2.next );
			return l2;
		}
	}
	
	
	*/
	