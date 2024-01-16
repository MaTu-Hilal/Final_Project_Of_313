package LabPaper;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Press 1 for working with array.");
			System.out.println("Press 2 for working with linkedlist");
			System.out.println("Press 3 for Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				DSA_Project.Final f  = new DSA_Project.Final();
				break;
			case 2:
				Linkedlist.Menu m = new Linkedlist.Menu();
				break;
			}
		}
		while(choice!=3);
		System.out.println("***************---THE END---************");
	}
}
