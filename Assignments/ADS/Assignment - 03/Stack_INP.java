import java.util.Scanner;

class Stack_INP{

	private int max;
    private int top;
    private char arr[]; // Changed to char for operator handling

    Stack_INP(int size) {
        max = size;
        top = -1;
        arr = new char[max];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(char data) { // Changed to char
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = data;
    }

    char pop() { // Changed to char
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return '\0'; // Return null character for error indication
        }
        return arr[top--];
    }
	
	public int getPriority(char c) {
		if(c == '+' || c == '-') {
			return 1;
		} else {
			return 2;
		} 
	}
	
	static String INP(String s){
		
		int n = s.length();
		Stack_INP s1 = new Stack_INP(n); 
		String postfix = "";
		char ch[] =  s.toCharArray();
	
		for (char c: ch){
			
			if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')' ){
				postfix = postfix + c;
			}
			else if (c == '('){
				s1.push(c);
			}
			else if (c == ')'){
				while (!s1.isEmpty()){
					char t = (char) s1.pop();
					if (t != '('){
						postfix = postfix + c;
					}
					else {
						break;
					}
				}
			}
			else if(c == '+' || c == '-' || c == '/' || c == '*' ){
				if (s1.isEmpty()){
					s1.push(c);
				}
				else{
					while (!s1.isEmpty()){
						char t =(char) s1.pop();
						if (t == '('){
							s1.push(t);
							break;
						}
						else if(t == '+' || t == '-' || t == '/' || t == '*' ){
							if (s1.getPriority(t) < s1.getPriority(c)){
								s1.push(t);
								break;
							}
							else{
								postfix = postfix + c;
							}
						}
					}
					s1.push(c);
				}
			}
		}
		while (!s1.isEmpty()){
			postfix = postfix + s1.pop();
		}
		return postfix;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//String s = "2+3*4";
		String result = INP(s);
		System.out.println(result);
	}
}