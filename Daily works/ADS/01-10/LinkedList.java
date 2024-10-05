//  Studying purpose
public class LinkedList{
	
	public static class Node{
		int data;
		Node next;
		
		Node( int data ){
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	
	public void addFirst(int data){               //O(1)
		
		Node newNode = new Node(data);
		size++;
		
		if( head == null ){
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data){               //O(1)
		
		Node newNode =  new Node(data);
		size++;
		
		if ( head ==  null ){
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void display(){                       //O(n)
		
		Node temp = head;
		
		while( temp != null ){
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
	public void add( int index, int data ){
		
		if (index == 0){
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		size++;
		
		Node temp = head;
		int i = 0;
		
		while( i < (index - 1)){
			temp = temp.next;
			i++;
		}
		
		// i = index-1 & temp == prev
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	public int removeFirst(){                                   //O(n)
		
		if (size == 0){
			System.out.println("LL is empty");
			return -1;
		}
		else if (size == 1){
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	public int removeLast(){                             // main remove for all ( first and last )
		
		if (size == 0){
			System.out.println("LL is empty");
			return -1;
		}
		else if (size == 1){
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		Node prev = head;
		for (int i = 0; i < size-2; i++){
			prev = prev.next;
		}
		
		int val =  prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
		
	}
	
	public int itrSearch(int key){             //0(n)
		
		Node temp = head;
		int i = 0;
		
		while (temp != null){
			if (temp.data == key){
				return i;
			}
			temp = temp.next;
			i++;
		}
		
		// key not found case
		return -1;
	}
	
	public int helper(Node head, int key){             //O(n)   both time and space
		
		if (head == null){
			return -1;
		}
		
		if (head.data == key){
			return 0;
		}
		int index = helper(head.next, key);
		if (index == -1){
			return -1;
		}
		return index+1;
	}
	
	public int recSearch(int key){
		return helper(head, key);
	}
	
	public void deleteNode(int key){
		
		Node temp = head, prev = null;
		if (temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while( temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if (temp == null){
			return;
		}
		prev.next = temp.next;
	}


	public static void main(String args[]){
		
		LinkedList l1 = new LinkedList();
		
		
		l1.addFirst(2);
		l1.addFirst(1);
		l1.addLast(3);
		l1.addLast(4);
		l1.add(2,9);
		
		l1.display();
		System.out.print("Size : "+size);
		System.out.print("\nSearch : "+l1.itrSearch(9));
		l1.deleteNode(9);
		System.out.println("\nSearch : "+l1.recSearch(9));
		l1.display();
		
	
	}

}