package DSA_Project;

import java.util.Scanner;

public class Final {
	static int choiceM;
	Scanner sc = new Scanner(System.in);
	
	public Final() {
		do {
			System.out.println("Press 1 for Array");
			System.out.println("Press 2 for Stack");
			System.out.println("Press 3 for Queue");
			System.out.println("Press 4 for Exit");
			System.out.println("Enter your choice: ");
			choiceM = sc.nextInt();
			switch(choiceM) {
			case 1:
				Array ar = new Array();
				break;
			case 2:
				Stack st = new Stack();
				break;
			case 3:
				System.out.println("Press 1 for Simple Queue");
				System.out.println("Press 2 for Circular Queue");
				System.out.println("Enter your choice: ");
				choiceM = sc.nextInt();
				switch(choiceM) {
				case 1:
					Queue Q = new Queue();
					break;
				case 2:
					CircularQueue cq = new CircularQueue();
					break;
				}
			}
	}
	while(choiceM!=4);
}
}


