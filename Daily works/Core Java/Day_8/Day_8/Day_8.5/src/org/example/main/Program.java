package org.example.main;

import org.example.util.EmployeeUtil;
import org.example.util.IOOperation;

public class Program {
	public static void main(String[] args) {
		IOOperation choice;
		EmployeeUtil util = new EmployeeUtil();
		while( ( choice = EmployeeUtil.menuList( ) ) != IOOperation.EXIT) {
			switch( choice ) {
			case ACCEPT_RECORD:
				util.acceptRecord();
				break;
			case PRINT_RECORD:
				util.printRecord();
				break;
			}
		}
	}
}
