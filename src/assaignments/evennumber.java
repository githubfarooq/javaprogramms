package assaignments;

import java.util.Scanner;

public class evennumber {
	public static void main(String[] args) {
		Scanner G =new Scanner(System.in);
		System.out.println("please enter the number:");
		int number=G.nextInt();
		if(number%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
		G.close();
	}

}
