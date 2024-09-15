package p1;

class InstanceCounter{
	static int  count;
	
	InstanceCounter() {
		count++;
	}
	
	void printRecord() {
		System.out.println(count);
	}
	
}

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceCounter l1 = new InstanceCounter();
		InstanceCounter l2 = new InstanceCounter();
		l1.printRecord();
		l2.printRecord();

	}

}
