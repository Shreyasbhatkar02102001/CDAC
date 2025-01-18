import java.util.Scanner;


class StackApp{
	
	private int max;
	private int top;
	private int s1[];
	
	StackApp(int s){
		top = -1;
		max = s;
		s1 = new int[max];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == (max - 1);
	}
	
	public void push(int x){
		if (isFull()){
			System.out.println("Overflow");
		}
		else {
			s1[++top] = x;
		}
	}
	
	public int pop(){
		if (isEmpty()){
			System.out.println("Undeflow");
		}
		
		return	s1[top--];
		
	}
	
	public int peek(){
		if (isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		return s1[top];
	}
	
	public void display(){
		if (isEmpty()){
			System.out.println("Stack is Empty");
		}
		else{
			for (int i = 0; i < s1.length; i++){
				System.out.println(s1[i]);
			}
		}
	}
	

//}


//class StackApp{
	

	
	public static void main(String args[]){
		System.out.print("Enter : ");
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		StackApp s = new StackApp(3);
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println();
		int a = s.peek();
		
		System.out.println(a);
		s.display();
		
		System.out.println();
		s.pop();
		s.display();
	}




}


/*

class StackApp {
    
    private int max;
    private int top;
    private int s1[];
    
    StackApp(int s) {
        top = -1;
        max = s;
        s1 = new int[max];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == (max - 1);
    }
    
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            s1[++top] = x;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1; // Return a default value or throw an exception
        }
        return s1[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return s1[top];
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(s1[i]);
            }
        }
    }
    
    public static void main(String args[]) {
        System.out.print("Enter stack size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StackApp s = new StackApp(size);
        
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println();
        int a = s.peek();
        System.out.println("Top element: " + a);
        
        System.out.println("Stack elements:");
        s.display();
        
        System.out.println();
        System.out.println("Popping an element...");
        s.pop();
        System.out.println("Stack elements after pop:");
        s.display();
    }
}
*/