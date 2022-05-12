
/*
 * Created by Steve C. 
 * 5/11/2022
 * Example of a Stack java implementation
 */

import java.io.*;
import java.util.*;

class StackExample {
	

	public static void main(String args[]){
		
		//create scanner for user input
		Scanner myObj = new Scanner(System.in);

		System.out.println("\n---------- My Stack Example Program ---------");
		
		//variable for operation selection
		int selection = 0;

		//create stack
		Stack<String> myStack = new Stack<String>();

		//continue until exit is operation is called
		while(selection != 6){
			
			//display menu
			menu();

			//selection for operator
			selection = myObj.nextInt();

			if(selection == 1){
				
				//Get input from user and confirm book was added
				System.out.println("Enter name of book: ");
				Scanner myBook = new Scanner(System.in);
				String bookName = myBook.nextLine();
				myStack.push(bookName);
				System.out.println("book added");
			
			} else if(selection == 2){
				
				//check to see if stack is empty
				if(myStack.isEmpty()){                                        
					System.out.println("Stack is empty");						
				} else {
					//if not empty perform pop operation
					String temp = myStack.pop();
					System.out.println(temp + " book was removed");
				}


			} else if(selection == 3){
				
				//check to see if stack is empty
				if(myStack.isEmpty()){
					System.out.println("Stack is empty");
				} else {
					//if not empty perform peek operation
					String temp = myStack.peek();
					System.out.println(temp + " book is at the top of the stack");
				}

			} else if(selection == 4){
				
				//check to see if stack is empty
				if(myStack.isEmpty()){
					System.out.println("Stack of books is empty");
				} else {
					System.out.println("Stack of books is not empty");
				}

			} else if(selection == 5){
				
				//Print book stack
				System.out.println();
				System.out.println("___________");
				printStack(myStack);
				System.out.println();	
			
			} else if(selection == 6){
				
				//Exit System
				System.out.println("exit");
			
			}
			else {
				
				System.out.println("Incorrect Input. Try again.");
			
			}

		}

		System.out.println("Program Exiting");
	
	}

	public static void menu(){
		System.out.println("\n---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Stack operations");
		System.out.println("1 - push");
		System.out.println("2 - pop");
		System.out.println("3 - peek");
		System.out.println("4 - isEmpty");
		System.out.println("5 - print stack");
		System.out.println("6 - close program");
		System.out.println("input a number to perform an operation");
		
	}

	public static void printStack(Stack<String> s){
		    
		if (s.isEmpty()){
	        	return;
		}
			 
		String x = s.peek();
		s.pop();		  
		System.out.print(x);
		for(int i = x.length() ; i < 11; i++){
			System.out.print("_");
		}
		System.out.println("|");
		printStack(s);
		s.push(x);
		
	}

}
