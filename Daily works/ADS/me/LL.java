// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    
    static class Node{
        int data ;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void add(int index, int data){
        
        if (index == 0){
            addFirst(data);
            return;
        }
        
        Node prev = head;
        Node newNode = new Node(data);
        size++;
        int i = 0;
        while (i < (index-1)){
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }
    
    public void display(){
        int i = 0;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
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
            System.out.println("Element doesn't exists");
            return;
        }
        prev.next = temp.next; 
    }
    
    
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.addFirst(2);
        l1.display();
        l1.addFirst(5);
        l1.display();
        l1.addLast(8);
        l1.display();
        l1.addLast(1);
        l1.display();
        l1.add(3,10);
        
        l1.display();
        //System.out.println("Size : "+l1.size);
        l1.deleteNode(10);
        l1.display();
    }
}