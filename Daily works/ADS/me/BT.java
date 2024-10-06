
class BT{
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	Node root;  // start of the root node
	
	BT(){
		root = null;
	}
	
	BT(int d){
		root = new Node(d);
	}
	
	void printPreorder(Node node){
		if (node == null){
			return ;
		}
		System.out.print(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void preorder(){
		printPreorder(root);
	}
	
	void printInorder(Node node){
		if (node == null){
			return;
		}
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}
	
	void inorder(){
		printInorder(root);
	}
	
	void printPostorder(Node node){
		if (node == null){
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.data + " ");
	}
	
	void postorder(){
		printPostorder(root);
	}
	
	
	public static void main(String args[]){
		BT b1 = new BT();
		b1.root = new Node(11);
		b1.root.left = new Node(22);
		b1.root.left.left = new Node(33);
		b1.root.left.right = new Node(44);
		b1.root.right = new Node(55);
		b1.root.right.left = new Node(66);
		b1.root.right.right = new Node(77);
		
		System.out.println("Preorder : ");
		b1.preorder();
		System.out.println();
		
		System.out.println("Inorder : ");
		b1.inorder();
		System.out.println();
		
		System.out.println("Postorder : ");
		b1.postorder();
		System.out.println();
		
	}
}