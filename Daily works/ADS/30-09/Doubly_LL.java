/*
-----------------------------------------
Doubly Linked List 
-----------------------------------------
*/

class Doubly_LL{
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
	
		Node (int d)
		{	
			data = d;
			prev = next = null;
		}
		
		void insert( int new_data )	{
			Node new_node = new Node( new_data );     // create node
			new_node.next = head;                     // build connection
			new_node.prev = null; 
		
			if( head != null )                        //  if head is not equal null
				head.prev = new_node;                // then assign head.prev to above new node
		
			head = new_node;
		}
		
		void display(node n ){
			Node p = null;
			System.out.println("Forward Direction : ");
			
			while( n != null )
			{
				System.out.print(n.data+" --> ");
				p = n;                                  // two pointer approach  p is assign to current node
				n = n.next;                             //  current node is assigned to next node
			}
			
			System.out.println("Reverse Direction : ");
			
			while( p != null )
			{
				System.out.print(p.data+" <-- ");
				p = p.prev;
			}
		}
		
		public static void main(String args[]) {
			
			Doubly_LL d1 = new Doubly_LL();
			d1.insert(9);
			d1.insert(8);
			d1.insert(7);
			d1.insert(6);
			
			d1.display(d1.head);
		}
		
		
	}
	
	
	
	
}

/*
--------------------------
    DLL Operations:
--------------------------

!. Insertion:

  1.1 Insertion at the begining

	void insert( int new_data )	{
		Node new_node = new Node( new_data );     // create node
		new_node.next = head;                     // build connection
		new_node.prev = null; 
		
		if( head != null )                        //  if head is not equal null
			head.prev = new_node;                // then assign head.prev to above new node
		
		head = new_node;
	}
	
2. Display:


*/