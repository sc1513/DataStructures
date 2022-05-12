
/*
 * Created by Steve C. 
 * 5/11/2022
 * Example of a Stack java implementation
 */

import java.io.*;
import java.util.*;

class StackExample {
	

	public static void main(String args[]){
		
		Scanner myObj = new Scanner(System.in);

		System.out.println("My Stack Example Program");
		int selection = 0;
		Stack<String> myStack = new Stack<String>();
		StackExample myExample = new StackExample();

		while(selection != 5){
			myExample.menu();
			selection = myObj.nextInt();
			
			if(selection == 1){
				System.out.println("Enter name of book: ");
				Scanner myBook = new Scanner(System.in);
				String bookName = myBook.nextLine();
				myStack.push(bookName);
				System.out.println("book added");
			} else if(selection == 2){
				String temp = myStack.pop();
				System.out.println(temp + " book was removed");
			} else if(selection == 3){
				String temp = myStack.peek();
				System.out.println(temp + " book is at the top of the stack");
			} else if(selection == 4){
				boolean tf = myStack.isEmpty();
				if(tf){
					System.out.println("Stack of books is empty");
				} else {
					System.out.println("Stack of books is not empty");
				}
			} else {
				System.out.println("Try again");
			
		}

		
		}
		System.out.println("Program Exiting");
	}

	public void menu(){
		System.out.println("Stack operations");
		System.out.println("1 - push");
		System.out.println("2 - pop");
		System.out.println("3 - peek");
		System.out.println("4 - isEmpty");
		System.out.println("5 - close program");
	}




}
