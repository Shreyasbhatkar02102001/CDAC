package p2;

/*
 * 2.	Design and implement a class named Logger to manage logging messages for an application. The class should be implemented as a singleton to ensure that only one instance of the Logger exists throughout the application.

The class should include the following methods:
•	getInstance(): Returns the unique instance of the Logger class.
•	log(String message): Adds a log message to the logger.
•	getLog(): Returns the current log messages as a String.
•	clearLog(): Clears all log messages.

 */

import java.util.Scanner;

class Logger {
	
	private static Logger instance = null;
	private StringBuilder s1;
	
	Logger(){
		s1 = new StringBuilder();
	}
	
	private static Logger reference = null;
	public static Logger  getReference() {
		if  (reference == null) {
			reference = new Logger();
		}
		return reference;
	}
	
	static Logger getInstance() {
        if (instance == null) {
            
            instance = new Logger();
        }
        return instance;
    }
	
	
	void log (String message) {
		s1.append(message);
		//System.out.println(s1);
	}
	
	String getLog() {
		return s1.toString();
	}
	
//	public String getS1() {
//		return s1;
//	}

	void clearLog(){
		s1.setLength(0);
	}
	
	
}

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l1 = Logger.getReference();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Log message : ");
		//sc.nextLine();
		l1.log(sc.nextLine());
		System.out.print("\nLog before clearLog(): ");
		l1.getLog();
		l1.clearLog();
		System.out.print("\nLog after clearLog(): ");
		l1.getLog();
		sc.close();

	}

}
