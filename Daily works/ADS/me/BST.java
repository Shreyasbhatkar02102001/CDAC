
class BST{

	Node root;
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	
	BST(){
		root = null;
	}
	
	BST(int data){
		root = new Node(data);
	}
	
	Node insert(Node root, int key){
		
		if (root == null){
			root = new Node(key);
			return root;
		}
		if (key <= root.data){
			root.left = insert(root.left, key);
		}
		else{
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	void printinsert(int key){
		root = insert(root, key);
	}
	
	void printinorder(Node node){
		if (node == null){
			return ;
		}
		printinorder(node.left);
		System.out.print(node.data + " ");
		printinorder(node.right);
	}
	
	void inorder(){
		printinorder(root);
	}
	
	Node delete(Node root, int key){
		
		if (root == null){
			return root;
		}
		if (key > root.data){
			root.left = delete(root.left, key);
		}
		else if (key < root.data){
			root.right = delete(root.left, key);
		}
		else{
			if (root.left == null){
				return root.right;
			}
			else if (root.right == null){
				return root.left;
			}
			
			root.data = minValue(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}
	
	int minValue(Node root){	
		int x = root.data;
		while (root.left != null){
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	
	void printdelete(int key){
		root = delete(root, key);
	}
	
	public static void main(String args[])
	{
		
		BST t1 = new BST();
		t1.printinsert(37);
		t1.printinsert(20);
		t1.printinsert(45);
		t1.printinsert(10);
		t1.printinsert(40);
		t1.printinsert(35);
		t1.printinsert(47);
		t1.printinsert(70);
		t1.printinsert(25);
		t1.printinsert(100);
		t1.printinsert(60);
		t1.printinsert(85);
		
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(10);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(70);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(45);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		
				
	}
	
}