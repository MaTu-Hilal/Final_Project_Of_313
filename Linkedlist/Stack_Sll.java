package Linkedlist;
import java.util.Scanner;

public class Stack_Sll {
	static Scanner sc = new Scanner(System.in);
	static int choice;
	static class Node{
		int info;
		Node next;
		Node(int info){
			this.info = info;
			this.next = null;
		}
	}
	static Node top = null;

	Stack_Sll(){
		do {
		System.out.println("Press 1 for push");
		System.out.println("Press 2 for pop");
		System.out.println("Press 3 for Display");
		System.out.println("Press 4 for Exit");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the item value you went to insert: ");
			int item = sc.nextInt();
			push(item);
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
		}
		}
		while(choice!=4);
	}
	
/**************************************************************/			
/******************** Stack Insertion ****************/		
/**************************************************************/		

	static void push(int item) {
		Node ptr = new Node(item);
		ptr.info = item;
		ptr.next = top;
		top = ptr;
	}
	
/**************************************************************/			
/******************** Stack deletion ****************/		
/**************************************************************/		

	static void pop() {
		if(top==null) {
			System.out.println("Stack is Empty.");
			return;
		}
		top = top.next;
		System.out.println("Item Deleted Successfully!");
	}
	
/**************************************************************/			
/******************** Stack Display ****************/		
/**************************************************************/		

	static void display() {
		Node ptr = top;
		while(ptr!=null) {
			System.out.println(ptr.info);
			ptr = ptr.next;
		}
	}
}
